package org.thq.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.thq.annotation.business.MyInterface;
import org.thq.annotation.business.MyInterfaceImpl;

@Configuration
@ComponentScan
public class ApplicationConfig {
	@Bean(name="abc")
	public MyInterface myInterface() {
		return new MyInterfaceImpl();
	}

}
