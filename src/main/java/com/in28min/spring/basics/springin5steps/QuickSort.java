package com.in28min.spring.basics.springin5steps;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class QuickSort implements SortAlgorithm {
	
	public int[] sort(int[] numbers) {
		return numbers;
	}
}
