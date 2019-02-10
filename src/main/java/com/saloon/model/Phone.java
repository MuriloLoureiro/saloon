package com.saloon.model;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.*;

abstract class Phone {
	
	@Id
	private Integer id;
	
	private String ddd;
	private String number;
	
	@OneToMany(mappedBy = "phone")
	private List<Customer> customers = new LinkedList<Customer>();
	
	public Phone() {
		
	}
	
	public Phone(String ddd, String number) {
		super();
		this.ddd = ddd;
		this.number = number;
	}

	
	
	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDdd() {
		return ddd;
	}

	public void setDdd(String ddd) {
		this.ddd = ddd;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

}
