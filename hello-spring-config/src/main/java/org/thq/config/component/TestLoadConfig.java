package org.thq.config.component;

import org.springframework.beans.factory.annotation.Value;

public class TestLoadConfig {
	@Value("${database.memsql.host}")
	private String host;
	public void toDo() {
		System.out.println("Value of config load:"+ host);
	}
}
