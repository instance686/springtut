package com.in28min.spring.basics.springin5steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class BinarySearchImpl {

	@Autowired
	@Qualifier("bubble-sort")
	private SortAlgorithm sortAlgorithm;

	public int binarySearch(int[] numbers, int numberToSearch) {
		int[] sortedNumbers = sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);
		return 3;
	}
}
