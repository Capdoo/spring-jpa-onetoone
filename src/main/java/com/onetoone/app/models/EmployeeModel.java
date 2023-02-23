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
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.ForeignKey;

@Entity
@Table(name="employees")
@Data
@NoArgsConstructor @AllArgsConstructor
@Builder
public class EmployeeModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_employee")
	private Long idEmployee;

	private String lastName;
	private String middleName;
	private String firstName;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "address_id", referencedColumnName = "id_address", foreignKey = @ForeignKey(name = "USER_FK_ADDRESS"))
	private AddressModel address;

}
