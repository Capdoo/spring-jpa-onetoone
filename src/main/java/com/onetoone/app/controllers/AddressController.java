package com.onetoone.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.onetoone.app.dto.AddressDTO;
import com.onetoone.app.dto.MessageDTO;
import com.onetoone.app.services.AddressService;

@RestController
public class AddressController {

	@Autowired
	AddressService addressService;
	
	@PostMapping("/address")
	public ResponseEntity<Object> register(@RequestBody AddressDTO addressDTO){
		
		addressService.save(addressDTO);
		
		return new ResponseEntity<Object>(new MessageDTO("Address registered"),HttpStatus.OK);
	}
	
	
}
