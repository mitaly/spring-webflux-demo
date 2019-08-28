package com.demo.webflux.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

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
	@GeneratedValue
	private int vehicleId;
	private String model;
	private Date registrationDate;
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="vehicle")
	private List<Fine> fines;
	@ManyToOne
	@JoinColumn(name="UserId")
	private User user;
}
