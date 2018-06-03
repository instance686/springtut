package com.in28min.spring.basics.springin5steps.basic;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl {
	

	private Logger LOGGER=LoggerFactory
			.getLogger(BinarySearchImpl.class); 

	@Autowired
	@Qualifier("bubble-sort")
	private SortAlgorithm sortAlgorithm;

	public int binarySearch(int[] numbers, int numberToSearch) {
		int[] sortedNumbers = sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);
		return 3;
	}
	
	@PostConstruct//called after dependencies are populated
	public void postConstruct() {
		LOGGER.info("postConstruct");
		
	}
	

	@PreDestroy//called before destroying of beans
	public void preDestryoy() {
		LOGGER.info("preDestryoy");
		
	}
}
