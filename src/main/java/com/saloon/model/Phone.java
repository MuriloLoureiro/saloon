package com.saloon.model;

abstract class Phone {

	private Integer id;
	private String ddd;
	private String number;
	
	public Phone() {
		
	}
	
	public Phone(String ddd, String number) {
		super();
		this.ddd = ddd;
		this.number = number;
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
