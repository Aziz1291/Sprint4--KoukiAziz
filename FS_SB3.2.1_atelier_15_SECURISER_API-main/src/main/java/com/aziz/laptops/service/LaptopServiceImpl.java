package com.aziz.laptops.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aziz.laptops.entities.Model;
import com.aziz.laptops.entities.Laptop;
import com.aziz.laptops.repos.LaptopRepository;

@Service
public class LaptopServiceImpl implements LaptopService {

	@Autowired
	LaptopRepository laptopRepository;
	
	@Override
	public Laptop saveLaptop(Laptop p) {
		return laptopRepository.save(p);
		
	}

	@Override
	public Laptop updateLaptop(Laptop p) {
		return laptopRepository.save(p);
		
	}

	@Override
	public void deleteLaptop(Laptop p) {
		laptopRepository.delete(p);

	}

   @Override
	public void deleteLaptopById(Long id) {
		laptopRepository.deleteById(id);
		
	}

	@Override
	public Laptop getLaptop(Long id) {
		return  laptopRepository.findById(id).get();
	
	}

	@Override
	public List<Laptop> getAllLaptops() {
		return laptopRepository.findAll();
	}
	
    @Override
	public List<Laptop> findByBrandLaptop(String nom) {
		return laptopRepository.findByBrandLaptop(nom);
	}

	@Override
	public List<Laptop> findByBrandLaptopContains(String nom) {
		return laptopRepository.findByBrandLaptopContains(nom);
	}

	@Override
	public List<Laptop> findByNomPrix(String nom, Double prix) {
		return laptopRepository.findByNomPrix(nom, prix);
	}
	
	@Override
	public List<Laptop> findByModel(Model model) {
		return laptopRepository.findByModel(model);
	}

	@Override
	public List<Laptop> findByModelIdModel(Long id) {
		return laptopRepository.findByModelIdModel(id);
	}

	@Override
	public List<Laptop> findByOrderByBrandLaptopAsc() {
		return laptopRepository.findByOrderByBrandLaptopAsc();
	}

	@Override
	public List<Laptop> trierLaptopsNomsPrix() {
		return laptopRepository.trierLaptopsNomsPrix();
	}


}

