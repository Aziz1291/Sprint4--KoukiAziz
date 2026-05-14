import { Injectable } from '@angular/core';
import { Laptop } from '../model/laptop.model';
import { Observable } from 'rxjs';
import { HttpClient, HttpHeaders } from '@angular/common/http';

const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};

@Injectable({
  providedIn: 'root'
})
export class LaptopService {
  apiURL: string = 'http://localhost:8080/laptops/api/all';

  laptops!: Laptop[];

  constructor(private http: HttpClient) {}

  listeLaptops(): Observable<Laptop[]> {
    return this.http.get<Laptop[]>(this.apiURL);
  }

  getLaptopById(id: number): Observable<Laptop> {
    return this.http.get<Laptop>(`http://localhost:8080/laptops/api/getbyid/${id}`);
  }

  addLaptop(laptop: Laptop): Observable<Laptop> {
    return this.http.post<Laptop>('http://localhost:8080/laptops/api/addprod', laptop, httpOptions);
  }

  updateLaptop(laptop: Laptop): Observable<Laptop> {
    return this.http.put<Laptop>('http://localhost:8080/laptops/api/updateprod', laptop, httpOptions);
  }

  deleteLaptop(id: number): Observable<void> {
    return this.http.delete<void>(`http://localhost:8080/laptops/api/delprod/${id}`);
  }

  getLaptopsByModel(idModel: number): Observable<Laptop[]> {
    return this.http.get<Laptop[]>(`http://localhost:8080/laptops/api/prodscat/${idModel}`);
  }
}
