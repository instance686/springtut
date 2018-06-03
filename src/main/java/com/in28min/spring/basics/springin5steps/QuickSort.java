package com.in28min.spring.basics.springin5steps;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary//if two components implements the autowired instance then primary one will get preference
public class QuickSort implements SortAlgorithm {
	
	public int[] sort(int[] numbers) {
		return numbers;
	}
}
