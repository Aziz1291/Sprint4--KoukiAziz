package com.aziz.laptops.service;

import java.util.List;

import com.aziz.laptops.entities.Model;
import com.aziz.laptops.entities.Laptop;

public interface LaptopService {
	
	 Laptop saveLaptop(Laptop p);
	 Laptop updateLaptop(Laptop p);
	 void deleteLaptop(Laptop p);
     void deleteLaptopById(Long id);
	 Laptop getLaptop(Long id);
	 List<Laptop> getAllLaptops();
	 
	 List<Laptop> findByBrandLaptop(String nom);
	 List<Laptop> findByBrandLaptopContains(String nom);
	 List<Laptop> findByNomPrix (String nom, Double prix);
	 List<Laptop> findByModel (Model model);
	 List<Laptop> findByModelIdModel(Long id);
	 List<Laptop> findByOrderByBrandLaptopAsc();
	 List<Laptop> trierLaptopsNomsPrix();

}

