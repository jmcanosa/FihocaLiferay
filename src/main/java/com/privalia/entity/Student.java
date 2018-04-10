package com.privalia.entity;

public class Student {
	
	private int idStudent;
	private String name;
	private String surname;
	private int age;
	private Adress adress;
	
	
	public int getIdStudent() {
		return idStudent;
	}
	public void setIdStudent(int idStudent) {
		this.idStudent = idStudent;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Adress getAdress() {
		return adress;
	}
	public void setAdress(Adress adress) {
		this.adress = adress;
	}
	
	public Student(int idStudent, String name, String username, int age, Adress adress) {
		super();
		this.idStudent = idStudent;
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.adress = adress;
	}
	
	@Override
	public String toString() {
		return "Student [idStudent=" + idStudent + ", name=" + name + ", surname=" + surname + ", age=" + age
				+ ", adress=" + adress + "]";
	}
	
	public Student() {
		
	}
	
	

}
