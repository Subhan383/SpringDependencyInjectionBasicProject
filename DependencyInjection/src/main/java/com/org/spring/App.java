package com.org.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.org.spring.classes.Corolla;
import com.org.spring.classes.Swift;
import com.org.spring.interfaces.Car;


public class App {

	public static void main(String[] args) {
	
		
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		
		Car myCar=context.getBean("swift",Car.class);
		
		
		System.out.println(myCar.specs());
		context.close();
	}

}
