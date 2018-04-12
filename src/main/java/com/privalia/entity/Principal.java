package com.privalia.entity;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class Principal {
	
	public static void main(String[] args) {

		AnnotationConfigApplicationContext annotationContext = new AnnotationConfigApplicationContext();
		
		annotationContext.scan(Principal.class.getPackage().getName());
		annotationContext.refresh();
			 
		Student student = (Student) annotationContext.getBean("student");


		System.out.println(student.toString());
		

		annotationContext.close();
		
		
		
	}

}
