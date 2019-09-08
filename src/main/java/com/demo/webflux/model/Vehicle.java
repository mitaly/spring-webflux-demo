package com.demo.webflux.model;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter(value=AccessLevel.PUBLIC)
@Document
public class Vehicle{
	@Id
	private Integer vehicleId;
	private String model;
	private Date registrationDate;
	@DBRef
	private List<Fine> fines;
}
