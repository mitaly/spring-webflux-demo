package com.demo.webflux.services;

import org.springframework.stereotype.Service;

import com.demo.webflux.repositories.AddressRepository;

@Service
public class AddressService {
	private AddressRepository addressRepository;
	
	public AddressService(final AddressRepository addressRepository) {
		this.addressRepository = addressRepository;
	}
	
	
}
