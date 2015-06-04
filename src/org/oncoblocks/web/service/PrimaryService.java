package org.oncoblocks.web.service;

import java.util.Arrays;
import java.util.List;

import org.apache.tomcat.util.http.parser.MediaType;
import org.oncoblocks.web.dao.GeneDAO;
import org.oncoblocks.web.dao.Gene;
import org.oncoblocks.web.dao.RestApiGet;
//import org.oncoblocks.web.dao.RestApiGet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PrimaryService {
	
	private GeneDAO geneDao; 	
	
//	private RestApiGet restApiGet;
//	public void setRestApiGet(RestApiGet restApiGet) {
//		this.restApiGet = restApiGet;
//	}


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
	
	public void getGeneInfoUsingRest(){
		RestTemplate restTemplate = new RestTemplate();
//		HttpHeaders headers = new HttpHeaders();
//		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
//		HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
        RestApiGet page = restTemplate.getForObject("http://mygene.info/v2/gene/672", RestApiGet.class);
        System.out.println("Name:    " + page.getSummary());
//        System.out.println("About:   " + page.getPir());
//        System.out.println("Phone:   " + page.getPhone());
//        System.out.println("Website: " + page.getWebsite());
	}

}
