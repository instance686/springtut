package com.in28min.spring.basics.springin5steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

	@Autowired
	private SortAlgorithm bubbleSortAlgorithm;

	public int binarySearch(int[] numbers, int numberToSearch) {
		int[] sortedNumbers = bubbleSortAlgorithm.sort(numbers);
		System.out.println(bubbleSortAlgorithm);
		return 3;
	}
}
