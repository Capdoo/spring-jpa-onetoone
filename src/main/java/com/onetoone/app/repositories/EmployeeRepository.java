package com.onetoone.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onetoone.app.models.EmployeeModel;


public interface EmployeeRepository extends JpaRepository<EmployeeModel, Long>{

	
	
}
