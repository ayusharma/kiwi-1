package org.oncoblocks.web.controllers;

import org.oncoblocks.web.dao.Gene;
import org.oncoblocks.web.service.PrimaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GeneController {

	private PrimaryService primaryService;
	public String temp;
	
	

	@Autowired
	public void setPrimaryService(PrimaryService primaryService) {
		this.primaryService = primaryService;
	}


	@RequestMapping("/geneform")
	public String showGeneForm(){
		return "geneform";
	}
	
	@RequestMapping(value="/entergeneinfo", method=RequestMethod.POST)
	public String enterGeneInfo(Model model, Gene gene,@RequestParam("entrez_gene_id") String entrez_gene_id){
//		System.out.println(gene.getEntrez_gene_id());
//		primaryService.create(gene);
		temp = primaryService.getGeneInfoUsingRest(entrez_gene_id);
//		System.out.println(gene.getEntrez_gene_id());
//		System.out.println(temp);
		Gene gene1 = new Gene(entrez_gene_id,temp);
		primaryService.create(gene1);
		
//		gene.setEntrez_gene_id();
//		sSystem.out.println(id);
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
