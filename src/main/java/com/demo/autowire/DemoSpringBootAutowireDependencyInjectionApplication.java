package com.demo.autowire;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoSpringBootAutowireDependencyInjectionApplication {
	
	public static void main(String[] args) {
		// SpringApplication.run(DemoSpringBootAutowireDependencyInjectionApplication.class, args);
		
		// Step 1
		// creation the customer object manually
		// but the dependency injection says: your focus is not to create objects, but your focus must be with logic
		// Customer customer = new Customer();
		
		// Step 2
		// get the context
		// the spring container (context) it's responsible to manage all objects
		ConfigurableApplicationContext context = SpringApplication.run(DemoSpringBootAutowireDependencyInjectionApplication.class, args);
		
		// Step 3
		// By default Spring Framework implements Singleton pattern
		Customer customer1 = context.getBean(Customer.class);
		customer1.message();
		
		
		// Step 4
		// inserted the @Scope annotation to return different instances the customer object - every time when executed getBean() method
		Customer customer2 = context.getBean(Customer.class);
		customer2.message();
		
		Customer customer3 = context.getBean(Customer.class);
		customer3.message();

		Customer customer4 = context.getBean(Customer.class);
		customer4.message();

		Customer customer5 = context.getBean(Customer.class);
		customer5.message();
		
		Customer customer6 = context.getBean(Customer.class);
		customer6.message();
		
		
		Car car1 = context.getBean(Car.class);
		car1.turn_on();
	}
}
