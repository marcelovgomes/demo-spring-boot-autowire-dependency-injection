package com.demo.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// Customer it's a simple POJO class
// Step 1 - Customer was created not as a Bean, because was not using @Component annotation

// Step 2 - add @Component annotation - this object will be created by Spring Framework.
// Spring Framework will inject this object in the application

// Step 3 - add @Scope(value="prototype") annotation
// a bean with prototype scope will return a different instance every time it is requested from the container.

// Step 4 - created Car class to show how @autowire works

@Component
@Scope(value="prototype")
public class Customer {
	private int id;
	private String name;
	
	// The @Autowired annotation allows Spring to resolve and inject collaborating beans into your bean.
	
	@Autowired         // searches the object by type
	@Qualifier("car1") // searches the object by name
	private Car car;

	// Step 3 - created the constructor simply to show the message when the object is created
	public Customer() {
		super();
		
		System.out.println("Customer object created => " + super.hashCode());
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void message() {
		System.out.println("Customer says Hi!");
		car.turn_on();
	}
}