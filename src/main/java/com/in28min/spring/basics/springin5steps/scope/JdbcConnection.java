package com.in28min.spring.basics.springin5steps.scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE
,proxyMode=ScopedProxyMode.TARGET_CLASS)//proxy is used to create new instance on jdbcconnection call
public class JdbcConnection {
	
	public JdbcConnection() {
		System.out.println("JDBC Connection");
	}
}
