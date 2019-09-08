package com.demo.webflux.services;

import org.springframework.stereotype.Service;

import com.demo.webflux.model.Fine;
import com.demo.webflux.model.Vehicle;
import com.demo.webflux.repositories.VehicleRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class VehicleService {
	private VehicleRepository vehicleRepository;
	
	public VehicleService(final VehicleRepository vehicleRepository) {
		this.vehicleRepository = vehicleRepository;
	}
	
	public Mono<Vehicle> getVehicleByVehicleId(int vehicleId){
		return vehicleRepository.findById(vehicleId);
	}
	
	public Flux<Fine> getFinesByVehicleId(int vehicleId){
		return vehicleRepository.getFinesByVehicleId(vehicleId);
	}
	
	public Mono<Vehicle> saveVehicle(Vehicle vehicle){
		return vehicleRepository.save(vehicle);
	}
}
