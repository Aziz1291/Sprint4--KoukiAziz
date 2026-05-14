package com.aziz.laptops.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "nomProd", types = { Laptop.class })
public interface LaptopProjection {
	public String getNomLaptop();
}


