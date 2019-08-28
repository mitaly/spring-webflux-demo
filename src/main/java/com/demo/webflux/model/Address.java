package com.demo.webflux.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Address {
	@Id
	@GeneratedValue
	private int addressId;
	private String buildingName;
	private String city;
	private String country;
	private String houseNumber;
	private String pinCode;
	private String state;
	private String street;
	
}
