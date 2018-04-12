package com.privalia.entity.listas;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;

public class Student {
	
	@Value("${student.idStudent}")
	private int idStudent;
	
	@Value("${student.name}")
	private String name;
	
	@Value("${student.age}")
	private int age;
	
	private List<Teacher> teacher;

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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<Teacher> getTeacher() {
		return teacher;
	}

	public void setTeacher(List<Teacher> teacher) {
		this.teacher = teacher;
	}

	public Student(int idStudent, String name, int age, List<Teacher> teacher) {
		super();
		this.idStudent = idStudent;
		this.name = name;
		this.age = age;
		this.teacher = teacher;
	}

	public Student() {
	
	}
	
	@Override
	public String toString() {
		return (new StringBuilder())
				.append("[#")
				.append(this.idStudent)
				.append(", ")
				.append(this.name)
				.append(", ")
				.append(this.age)
				.append(", ")
				.append(this.teacher)
				.append("] ")
				.toString();
	}


}
