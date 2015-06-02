package org.oncoblocks.web.controllers;

import org.oncoblocks.web.dao.Gene;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class GeneController {

	@RequestMapping("/geneform")
	public String showGeneForm(){
		return "geneform";
	}
	
	@RequestMapping(value="/entergeneinfo", method=RequestMethod.POST)
	public String enterGeneInfo(Model model, Gene gene){
		System.out.println(gene);
		return "geneinfo";
	}
	
//	@RequestMapping("/getgeneinfo")
//	public String getGeneInfo(){
//		return "geneinfo";
//	}
}
