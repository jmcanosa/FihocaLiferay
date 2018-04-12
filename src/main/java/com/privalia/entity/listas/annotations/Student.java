package com.privalia.entity.listas.annotations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import com.privalia.entity.listas.Teacher;

@Component(value ="student")
@PropertySource("classpath:config.properties")
public class Student {

	//@Value("${student.idStudent}")
	private int idStudent;
	
	//@Value("${student.name}")
	private String name;
	
	//@Value("${student.surname}")
	private String surname;
	
//	@Value("${student.age}")
	private int age;
	
	//@Autowired
	//@Qualifier("teachers")
	private List<Teacher> listTeacher;

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

	public List<Teacher> getListTeacher() {
		return listTeacher;
	}

	public void setListTeacher(List<Teacher> listTeacher) {
		this.listTeacher = listTeacher;
	}

	public Student(int idStudent, String name, String surname, int age, List<Teacher> listTeacher) {
		super();
		this.idStudent = idStudent;
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.listTeacher = listTeacher;
	}
	
	public Student() {

	}

	@Override
	public String toString() {
		return "Student [idStudent=" + idStudent + ", name=" + name + ", surname=" + surname + ", age=" + age
				+ ", listTeacher=" + listTeacher + "]";
	}
	
	
}
