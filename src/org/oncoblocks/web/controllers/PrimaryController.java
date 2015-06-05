package org.oncoblocks.web.controllers;

import java.util.List;

import org.oncoblocks.web.service.PrimaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.oncoblocks.web.dao.Gene;

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
}
