package org.thq.sec.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@RequestMapping(value="/home", method=RequestMethod.GET)  
    public String home() {  
        return "home";  
    }  
      
    @RequestMapping(value="/admin", method=RequestMethod.GET)  
    public String privateHome() {  
        return "privatePage";  
    }  
	
}
