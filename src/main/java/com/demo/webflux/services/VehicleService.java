package com.demo.webflux.services;

import org.springframework.stereotype.Service;

import com.demo.webflux.repositories.VehicleRepository;

@Service
public class VehicleService {
	private VehicleRepository vehicleRepository;
	
	public VehicleService(final VehicleRepository vehicleRepository) {
		this.vehicleRepository = vehicleRepository;
	}
}
