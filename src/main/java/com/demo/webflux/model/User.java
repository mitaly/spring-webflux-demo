package com.demo.webflux.model;

import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import com.demo.webflux.util.UserType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Document
public class User {
	@Id
	private int userId;
	private int age;
	private String firstName;
	private String lastName;
	private UserType userType;
	private Address address;
	@DBRef
	private List<Vehicle> vehicles;
}
