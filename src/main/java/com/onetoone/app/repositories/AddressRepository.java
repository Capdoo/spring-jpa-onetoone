package com.onetoone.app.repositories;

import com.onetoone.app.models.AddressModel;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AddressRepository extends JpaRepository<AddressModel, Long> {

	
	
}
