package com.privalia.entity.listas.annotations;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.privalia.entity.listas.Teacher;

@Configuration
public class MyConfig {
	
	@Bean
	public Student student() {
		Student student = new Student();
		student.setName("Manolo");
		student.setAge(16);
		student.setSurname("Fabada");
		student.setIdStudent(33);
		student.setListTeacher(teachers());
		return student;
	}
	
	@Bean
	public List<Teacher> teachers() {
		List<Teacher> teachers = new ArrayList<Teacher>();
		
		Teacher teacher1 = new Teacher (1, "Profesor 1");
		teachers.add(teacher1);
		Teacher teacher2 = new Teacher (2, "Profesor 2");
		teachers.add(teacher2);
		return teachers;
	}

}
