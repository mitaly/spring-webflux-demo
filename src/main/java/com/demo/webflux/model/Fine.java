package com.demo.webflux.model;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Fine {
	@Id
	@GeneratedValue
	private int fineId;
	private int amount;
	private boolean payed;
	@ManyToOne
	@JoinColumn(name="fineId")
	private Vehicle vehicle;
	private Date violationDate;
}
