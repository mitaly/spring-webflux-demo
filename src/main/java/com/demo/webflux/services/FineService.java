package com.demo.webflux.services;

import org.springframework.stereotype.Service;

import com.demo.webflux.repositories.FineRepository;

@Service
public class FineService {
	private FineRepository repository;
	
	public FineService(FineRepository repository) {
		this.repository = repository;
	}
}
