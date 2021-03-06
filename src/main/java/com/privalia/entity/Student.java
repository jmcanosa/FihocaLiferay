package com.privalia.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.stereotype.Component;

@Component(value ="student")
@PropertySource("classpath:config.properties")
public class Student {
	

	@Value("${student.idStudent}")
	private int idStudent;
	
	@Value("${student.name}")
	private String name;
	
	@Value("${student.surname}")
	private String surname;
	
	@Value("${student.age}")
	private int age;
	
	@Autowired
	@Qualifier("adress")
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
	
	public Student(int idStudent, String name, String surname, int age, Adress adress) {
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
	
//	@Bean
//	public static PropertySourcesPlaceholderConfigurer propertyConfigugInDev(){
//		return new PropertySourcesPlaceholderConfigurer();
//	}
	
	

}
