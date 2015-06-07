package main.java.org.oncoblocks.kiwi.web.controllers;

import main.java.org.oncoblocks.kiwi.web.service.PrimaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class PrimaryController {
	
	private PrimaryService primaryService;
	
	
	@Autowired
	public void setPrimaryService(PrimaryService primaryService) {
		this.primaryService = primaryService;
	}
	
	@RequestMapping("/")
	public String showHome(Model model){
		
		
		 return "home";
	}
	@RequestMapping("/about")
	public String showAbout(Model model){
		
		
		 return "about";
	}
}
