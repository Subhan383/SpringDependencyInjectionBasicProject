package com.org.spring.classes;

import org.springframework.stereotype.Component;

import com.org.spring.interfaces.Car;

@Component
public class Corolla implements Car {

	public String specs() {
		// TODO Auto-generated method stub
		return "Sedan from Toyota";
	}

}
