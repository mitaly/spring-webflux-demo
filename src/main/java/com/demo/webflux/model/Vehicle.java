package com.demo.webflux.model;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Vehicle{
	@Id
	private int vehicleId;
	private String model;
	private Date registrationDate;
	private List<Fine> fines;
}
