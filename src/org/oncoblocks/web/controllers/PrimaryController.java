package org.oncoblocks.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PrimaryController {
	
	@RequestMapping("/")
	public String showHome(){
		 return "home";
	}
}
