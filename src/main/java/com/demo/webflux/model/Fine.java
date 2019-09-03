package com.demo.webflux.model;

import java.util.Date;

import org.springframework.data.annotation.Id;

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
	private int fineId;
	private int amount;
	private boolean payed;
	private Vehicle vehicle;
	private Date violationDate;
}
