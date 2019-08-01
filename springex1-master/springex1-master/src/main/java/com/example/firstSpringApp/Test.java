package com.example.firstSpringApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@SpringBootApplication
public class Test {
		public static void main(String[] args) {
			
			// container ---> our java object
			// new
	ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
			
			Vehicle veh=(Vehicle)applicationContext.getBean(args[0]);
			veh.start();
			//Vehicle vehicle=new Bike();
			//vehicle.start();
			
			
			//SpringApplication.run(FirstSpringAppApplication.class, args);
		}
}
