package org.thq.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
	@RequestMapping("/home")
	public String home() {
		return "home";
	}
	@RequestMapping("/admin")
	public String admin() {
		return "admin";
	}

}
