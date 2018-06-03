package com.in28min.spring.basics.springin5steps.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class ExternalProperties {

	@Value("${external.service.url}")
	String url;
	
	public String getExtrernalURL() {
		return url;
	}

}
