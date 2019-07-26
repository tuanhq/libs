package org.thq.config.service;

import org.springframework.beans.factory.annotation.Value;

public class MyInterfaceImpl implements MyInterface{
	

	@Value("${database.memsql.host}")			
	private String  host;
	@Value("${database.memsql.port}")
	private String port;
	@Value("${database.memsql.user}")
	private String user;

	@Override
	public void toDo() {
		System.out.println("MyIntefaceImpl todo!");
		System.out.println(host+port+user);
		
	}

}
