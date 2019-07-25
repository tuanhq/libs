package org.thq.spring.rest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.thq.spring.rest.model.Student;

@RestController
public class WelcomeController {
	@RequestMapping("/*")
	public String welcome() {
		return "page not found";
	}
	@RequestMapping("/hello")
	public String hello() {
		return "hello";
	}
	@RequestMapping("/student")
	public Student student() {
		Student student = new Student();
		student.setAge(11);
		student.setName("Ann");
		return student;
	}

}
