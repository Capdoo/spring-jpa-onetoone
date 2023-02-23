package com.onetoone.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.onetoone.app.dto.EmployeeDTO;
import com.onetoone.app.dto.MessageDTO;
import com.onetoone.app.services.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@PostMapping("/employees")
	public ResponseEntity<Object> registerEmployee(@RequestBody EmployeeDTO employeeDTO){
		
		employeeService.save(employeeDTO);
		
		return new ResponseEntity<Object>(new MessageDTO("Employee registered"),HttpStatus.OK);
	}
	
}
