package com.in28min.spring.basics.springin5steps;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.in28min.spring.basics.springin5steps.basic.BinarySearchImpl;
import com.in28min.spring.basics.springin5steps.properties.ExternalProperties;

@Configuration
@ComponentScan
@PropertySource("classpath:app.properties")
public class SpringIn5StepszPropertiesApplication {

	public static void main(String[] args) {
	
		try(AnnotationConfigApplicationContext context=
				new AnnotationConfigApplicationContext(SpringIn5StepszPropertiesApplication.class))
		{		
			ExternalProperties externalProperties=context.getBean(ExternalProperties.class);
		System.out.println(externalProperties.getExtrernalURL());
		
		}
	}
}
