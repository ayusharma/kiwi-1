package org.oncoblocks.web.service;

import java.util.List;

import org.oncoblocks.web.dao.GeneDAO;
import org.oncoblocks.web.dao.Gene;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrimaryService {
	
	private GeneDAO geneDao; 	

	
	@Autowired
	public void setGeneDao(GeneDAO geneDao) {
		this.geneDao = geneDao;
	}


	public List<Gene> getGeneInfo(){
		return geneDao.getGene();
	}
	
	public void create(Gene gene) {
		geneDao.create(gene);
	}

}
