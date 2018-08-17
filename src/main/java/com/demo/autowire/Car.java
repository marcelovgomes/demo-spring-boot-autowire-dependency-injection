package com.demo.autowire;

import org.springframework.stereotype.Component;

// Step 1 - the Car class is created without @Component annotation
// Step 2 - add @Component annotation

@Component("car1")
public class Car {
	private int id;
	private String brand;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", brand=" + brand + "]";
	}

	public void turn_on() {
		System.out.println("Car => Turn on" );
	}
}