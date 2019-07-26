package org.thq.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.thq.config.component.TestLoadConfig;
import org.thq.config.service.MyInterface;
import org.thq.config.service.MyInterfaceImpl;
import org.thq.config.service.MyTestConfigClazz;

@Configuration
@ComponentScan(basePackages="org.thq.config.service")
@PropertySource("classpath:application.properties")
public class ApplicationConfig {
	@Bean
	public MyInterface myInterface() {
		return new MyInterfaceImpl();
	}
	@Bean
	public TestLoadConfig testLoadConfig() {
		return new TestLoadConfig();
	}

}
