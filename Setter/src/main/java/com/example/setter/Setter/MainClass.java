package com.example.setter.Setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("demo.xml");
		
		Triangle t = (Triangle) context.getBean("demo");
		
		System.out.print(t.getName()+ " " +t.getYourname());

	}

}
