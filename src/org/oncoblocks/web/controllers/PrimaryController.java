package org.oncoblocks.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PrimaryController {
	
	@RequestMapping("/")
	public String showHome(Model model){
		
		model.addAttribute("name","Ayush");
		 return "home";
	}
}
