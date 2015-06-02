package org.oncoblocks.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GeneController {

	@RequestMapping("/geneform")
	public String showGeneForm(){
		return "geneform";
	}
	
	@RequestMapping("/entergeneinfo")
	public String enterGeneInfo(){
		return "geneinfo";
	}
	
//	@RequestMapping("/getgeneinfo")
//	public String getGeneInfo(){
//		return "geneinfo";
//	}
}
