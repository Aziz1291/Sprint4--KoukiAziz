package com.aziz.laptops.entities;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Laptop {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idLaptop;
	private String brandLaptop;
	private Double prixLaptop;
	private Date dateCreation;
	
	@ManyToOne
	private Model model;

	
	

	public Laptop() {
		super();
	}

	public Laptop(String brandLaptop, Double prixLaptop, Date dateCreation) {
		super();
		this.brandLaptop = brandLaptop;
		this.prixLaptop = prixLaptop;
		this.dateCreation = dateCreation;
	}



	public Long getIdLaptop() {
		return idLaptop;
	}

	public void setIdLaptop(Long idLaptop) {
		this.idLaptop = idLaptop;
	}

	public String getNomLaptop() {
		return brandLaptop;
	}

	public void setNomLaptop(String brandLaptop) {
		this.brandLaptop = brandLaptop;
	}

	public Double getPrixLaptop() {
		return prixLaptop;
	}

	public void setPrixLaptop(Double prixLaptop) {
		this.prixLaptop = prixLaptop;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	
	public Model getModel() {
		return model;
	}

	public void setModel(Model model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Laptop [idLaptop=" + idLaptop + ", brandLaptop=" + brandLaptop + ", prixLaptop=" + prixLaptop
				+ ", dateCreation=" + dateCreation + "]";
	}
}

