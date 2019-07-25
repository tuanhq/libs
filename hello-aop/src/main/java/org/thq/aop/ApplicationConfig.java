package org.thq.aop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy(proxyTargetClass=true)
public class ApplicationConfig {
	@Bean
	public Student student() {
		Student student =  new Student();
//		student.setAge(11);
//		student.setName("Zaha");
		return student;
	}
	@Bean(name="logging")
	public Log4Me log4Me() {
		return new Log4Me();
	}

}
