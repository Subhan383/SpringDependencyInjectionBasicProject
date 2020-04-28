package com.org.spring.classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.org.spring.interfaces.Car;

@Component("swift")
public class Swift implements Car{
	@Autowired
	Engine engine;

	public String specs() {
		String specs="Hatchback from Suzuki with engine Type as"+ " "+engine.getType();
		return specs;
	}

}
