package com.cg.one.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.one.service.Employee;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext app=new ClassPathXmlApplicationContext("Spring_assignmentone.xml");
		
		Employee emp=(Employee) app.getBean("emp");
		emp.display();
		emp.getSBUDetails();
	}

}
