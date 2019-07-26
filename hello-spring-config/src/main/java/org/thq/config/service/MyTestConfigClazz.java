package org.thq.config.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class MyTestConfigClazz {
	@Value("${database.memsql.host}")
	private String host;
	public void toDo() {
		System.out.println("Value of config load:"+ host);
	}

}
