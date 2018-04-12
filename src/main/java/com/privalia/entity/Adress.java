package com.privalia.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("adress")
public class Adress {
	private int idAdress;
	private String street;

	public int getIdAdress() {
		return idAdress;
	}

	
	@Value("666")
	public void setIdAdress(int idAdress) {
		this.idAdress = idAdress;
	}

	public String getStreet() {
		return street;
	}
	
	
	@Value("Calle falsa 123")
	public void setStreet(String street) {
		this.street = street;
	}

	public Adress(int idAdress, String street) {
		super();
		this.idAdress = idAdress;
		this.street = street;
	}
	
	public Adress(){
		
	}

	@Override
	public String toString() {
		return "Adress [idAdress=" + idAdress + ", street=" + street + "]";
	}
	





}
