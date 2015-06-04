package org.oncoblocks.web.controllers;

import org.oncoblocks.web.dao.Gene;
import org.oncoblocks.web.service.PrimaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class GeneController {

	private PrimaryService primaryService;
	
	

	@Autowired
	public void setPrimaryService(PrimaryService primaryService) {
		this.primaryService = primaryService;
	}


	@RequestMapping("/geneform")
	public String showGeneForm(){
		return "geneform";
	}
	
	@RequestMapping(value="/entergeneinfo", method=RequestMethod.POST)
	public String enterGeneInfo(Model model, Gene gene){
		System.out.println(gene);
		primaryService.create(gene);
		primaryService.getGeneInfoUsingRest();
		return "geneinfo";
	}
	
//	@RequestMapping("/getgeneinfo")
//	public String getGeneInfo(Model model){
//		
//		String p = ps.getRestView();
//		System.out.println(p);
//		return "newgeneinfo";
//	}
}
