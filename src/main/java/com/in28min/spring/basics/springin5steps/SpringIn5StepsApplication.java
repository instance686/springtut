package com.in28min.spring.basics.springin5steps;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.in28min.spring.basics.springin5steps.basic.BinarySearchImpl;

@Configuration
@ComponentScan("com.in28min.spring.basics.springin5steps")
public class SpringIn5StepsApplication {

	public static void main(String[] args) {
	
		try(AnnotationConfigApplicationContext context=
				new AnnotationConfigApplicationContext(SpringIn5StepsApplication.class))
		{		
		BinarySearchImpl binarySearch=context.getBean(BinarySearchImpl.class);
		System.out.println(binarySearch);
		BinarySearchImpl binarySearch1=context.getBean(BinarySearchImpl.class);
		System.out.println(binarySearch1);

		int result=binarySearch.binarySearch(new int[] {12,4,6},3);
		System.out.println(result);
		}
	}
}
