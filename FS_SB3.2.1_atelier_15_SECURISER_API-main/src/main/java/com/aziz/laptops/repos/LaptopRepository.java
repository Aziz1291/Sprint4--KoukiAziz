package com.aziz.laptops.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.aziz.laptops.entities.Model;
import com.aziz.laptops.entities.Laptop;

public interface LaptopRepository extends JpaRepository<Laptop, Long> {
	List<Laptop> findByBrandLaptop(String nom);
	List<Laptop> findByBrandLaptopContains(String nom);   
	
	@Query("select p from Laptop p where p.brandLaptop like %:nom and p.prixLaptop > :prix")
	List<Laptop> findByNomPrix (@Param("nom") String nom,@Param("prix") Double prix);
    
	@Query("select p from Laptop p where p.model = ?1")
	List<Laptop> findByModel (Model model);
	
	List<Laptop> findByModelIdModel(Long id);
	
	List<Laptop> findByOrderByBrandLaptopAsc();
	
	@Query("select p from Laptop p order by p.brandLaptop ASC, p.prixLaptop DESC")
	List<Laptop> trierLaptopsNomsPrix ();
	              

}

