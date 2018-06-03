package com.in28min.spring.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.in28min.spring.basics.componentscan.ComponentDAO;
import com.in28min.spring.basics.springin5steps.scope.PersonDAO;

@SpringBootApplication
@ComponentScan("com.in28min.spring.basics.componentscan")
public class SpringIn5StepsComponentScopeApplication2 {
	
	private static Logger LOGGER=LoggerFactory
			.getLogger(SpringIn5StepsComponentScopeApplication2.class); 
	
	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringIn5StepsApplication.class, args);
		ComponentDAO componentDAO = context.getBean(ComponentDAO.class);
		
		
		LOGGER.info("{}",componentDAO);
		LOGGER.info("{}",componentDAO.getJdbcConnection());


	}
}
