package main.java.org.oncoblocks.kiwi.web.service;

import java.util.List;

import main.java.org.oncoblocks.kiwi.web.dao.Gene;
import main.java.org.oncoblocks.kiwi.web.dao.GeneDAO;
import main.java.org.oncoblocks.kiwi.web.dao.RestApiGet;
//import org.oncoblocks.web.dao.RestApiGet;
import org.springframework.beans.factory.annotation.Autowired;
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
	
	public String getGeneInfoUsingRest(String entrez_gene_id){
		RestTemplate restTemplate = new RestTemplate();
//		HttpHeaders headers = new HttpHeaders();
//		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
//		HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
        RestApiGet page = restTemplate.getForObject("http://mygene.info/v2/gene/"+entrez_gene_id, RestApiGet.class);
        System.out.println("Summary:    " + page.getSummary());
        return page.getSummary();
//        System.out.println("About:   " + page.getPir());
//        System.out.println("Phone:   " + page.getPhone());
//        System.out.println("Website: " + page.getWebsite());
	}

}
