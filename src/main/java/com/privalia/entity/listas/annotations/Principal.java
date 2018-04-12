package com.privalia.entity.listas.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;


public class Principal {
	
	
	public static void main(String[] args) {
	
		//AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		
//		context.scan("com.privalia.entity.listas.annotations");
//		context.refresh();
		
		Student student = (Student) context.getBean(Student.class);
		System.out.println(student.toString());
		
		
		context.close();
	}

}
