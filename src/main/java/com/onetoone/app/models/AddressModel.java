package com.onetoone.app.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="addresses")
@Data
@AllArgsConstructor @NoArgsConstructor
@Builder
public class AddressModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_address")
	private long idAddress;
	
	private String street;
	private String city;
	private Integer number;
	private Integer postalCode;
	
	@OneToOne(cascade =  CascadeType.ALL,mappedBy = "address")
	private EmployeeModel employee;
	
}
