import { Component, OnInit } from '@angular/core';
import { Laptop } from '../model/laptop.model';
import { LaptopService } from '../services/laptop.service';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-laptops',
  imports: [CommonModule],
  templateUrl: './laptops.component.html',
  styleUrl: './laptops.component.css'
})
export class LaptopsComponent implements OnInit {

  laptops!: Laptop[];

  constructor(private laptopService: LaptopService) {}

  ngOnInit(): void {
    this.chargerLaptops();
  }

  chargerLaptops() {
    this.laptopService.listeLaptops().subscribe(laptops => {
      console.log(laptops);
      this.laptops = laptops;
    });
  }
}
