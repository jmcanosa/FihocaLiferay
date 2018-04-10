package com.privalia.entity.annotations;


public class Adress {
	private int idAdress;
	private String street;

	public int getIdAdress() {
		return idAdress;
	}

	public void setIdAdress(int idAdress) {
		this.idAdress = idAdress;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}
	
	public Adress(int idAdress, String street) {
		super();
		this.idAdress = idAdress;
		this.street = street;
	}

	@Override
	public String toString() {
		return "Adress [idAdress=" + idAdress + ", street=" + street + "]";
	}
	


}
