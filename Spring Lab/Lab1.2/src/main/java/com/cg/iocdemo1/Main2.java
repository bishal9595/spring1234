package com.cg.iocdemo1;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		SBU sbu=context.getBean("sbu", SBU.class);

		// Get Bean of Type Employee AND ID emp
		Employee emp = context.getBean("employee", Employee.class);

		// Get Bean with ID emp, but DON'T assign Type
		

		System.out.println("Employee Details");
		System.out.println("-------------------------------------------");
		System.out.println(emp.toString());
		
	}

}
