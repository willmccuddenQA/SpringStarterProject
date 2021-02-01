package com.qa.starterproject;

import java.time.LocalTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class StarterProjectApplication {

	public static void main(String[] args) {
		ApplicationContext beanBag = SpringApplication.run(StarterProjectApplication.class, args);
		
		Object byName = beanBag.getBean("currentTime");
	    LocalTime byType = beanBag.getBean(LocalTime.class);
	    LocalTime byBoth = beanBag.getBean("currentTime", LocalTime.class);

	    System.out.println(byName);
	    System.out.println(byType);
	    System.out.println(byBoth);
	}
	
	@Bean
	public String helloWorld() {
		return "Hello World!";
	}
	
	@Bean
	public LocalTime currentTime() {
		return LocalTime.now();
	}

}
