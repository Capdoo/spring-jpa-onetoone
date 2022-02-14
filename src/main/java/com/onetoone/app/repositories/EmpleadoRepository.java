package com.onetoone.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onetoone.app.models.EmpleadoModel;


public interface EmpleadoRepository extends JpaRepository<EmpleadoModel, Long>{

	
	
}
