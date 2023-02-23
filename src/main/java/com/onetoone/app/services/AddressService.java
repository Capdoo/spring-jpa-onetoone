package com.onetoone.app.services;

import com.onetoone.app.models.AddressModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onetoone.app.dto.AddressDTO;
import com.onetoone.app.repositories.AddressRepository;

@Service
public class AddressService {

	@Autowired
	AddressRepository addressRepository;

	public void save(AddressDTO addressDTO) {
		AddressModel newAddress = new AddressModel();
		newAddress.setStreet(addressDTO.getStreet());
		newAddress.setCity(addressDTO.getCity());
		newAddress.setPostalCode(addressDTO.getPostalCode());
		newAddress.setNumber(addressDTO.getNumber());
		addressRepository.save(newAddress);
	}
	
}
