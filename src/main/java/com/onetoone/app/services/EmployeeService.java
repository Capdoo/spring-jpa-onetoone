package com.onetoone.app.services;

import com.onetoone.app.models.EmployeeModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onetoone.app.dto.EmployeeDTO;
import com.onetoone.app.models.AddressModel;
import com.onetoone.app.repositories.AddressRepository;
import com.onetoone.app.repositories.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;
	
	@Autowired
	AddressRepository addressRepository;
	
	public void save(EmployeeDTO employeeDTO) {
		
		AddressModel chosenAddress = addressRepository.getById(employeeDTO.getIdAddress());
		EmployeeModel newEmployee = new EmployeeModel();
			newEmployee.setLastName(employeeDTO.getLastName());
			newEmployee.setMiddleName(employeeDTO.getMiddleName());
			newEmployee.setFirstName(employeeDTO.getFirstName());
			newEmployee.setAddress(chosenAddress);
		employeeRepository.save(newEmployee);
	}
	
	
}
