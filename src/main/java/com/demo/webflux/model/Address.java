package com.demo.webflux.model;


import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Address {
	@Id
	private int addressId;
	private String buildingName;
	private String city;
	private String country;
	private String houseNumber;
	private String pinCode;
	private String state;
	private String street;
	
}
