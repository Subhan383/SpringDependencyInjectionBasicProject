package com.org.spring.classes;

import org.springframework.stereotype.Component;

@Component
public class Engine {

	String type;

	public String getType() {
		return type;
	}

	public Engine() {
		
		type = "V8";
	}
	
}
