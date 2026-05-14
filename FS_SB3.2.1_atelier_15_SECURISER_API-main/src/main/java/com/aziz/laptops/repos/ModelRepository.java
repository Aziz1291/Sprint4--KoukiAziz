package com.aziz.laptops.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.aziz.laptops.entities.Model;

@RepositoryRestResource(path = "cat")
public interface ModelRepository extends JpaRepository<Model, Long> {

}

