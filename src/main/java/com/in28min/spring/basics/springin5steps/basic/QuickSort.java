package com.in28min.spring.basics.springin5steps.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("quick-sort")
public class QuickSort implements SortAlgorithm {
	
	public int[] sort(int[] numbers) {
		return numbers;
	}
}
