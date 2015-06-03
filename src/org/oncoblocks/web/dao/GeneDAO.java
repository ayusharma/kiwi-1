package org.oncoblocks.web.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSourceUtils;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component("geneDao")
public class GeneDAO {

	private NamedParameterJdbcTemplate jdbc;
	
	@Autowired
	public void setDataSource(DataSource jdbc) {
		this.jdbc = new NamedParameterJdbcTemplate(jdbc);
	}

	public List<Gene> getGene() {

		return jdbc.query("select * from GENE_ANNOTATION", new RowMapper<Gene>() {

			public Gene mapRow(ResultSet rs, int rowNum) throws SQLException {
				Gene gene = new Gene();

				gene.setId(rs.getInt("id"));
				gene.setEntrez_gene_id(rs.getString("entrez_gene_id"));
				gene.setSummary(rs.getString("summary"));

				return gene;
			}

		});
	}
	
	public boolean update(Gene gene) {
		BeanPropertySqlParameterSource params = new BeanPropertySqlParameterSource(gene);
		
		return jdbc.update("update GENE_ANNOTATION set entrez_gene_id=:entrez_gene_id, summary=:summary where id=:id", params) == 1;
	}
	
	public boolean create(Gene gene) {
		
		BeanPropertySqlParameterSource params = new BeanPropertySqlParameterSource(gene);
		
		return jdbc.update("insert into GENE_ANNOTATION (entrez_gene_id, summary) values (:entrez_gene_id, :summary)", params) == 1;
	}
	
	@Transactional
	public int[] create(List<Gene> gene) {
		
		SqlParameterSource[] params = SqlParameterSourceUtils.createBatch(gene.toArray());
		
		return jdbc.batchUpdate("insert into GENE_ANNOTATION (id, entrez_gene_id, summary) values (:id, :entrez_gene_id, :summary)", params);
	}
	
	public boolean delete(int id) {
		MapSqlParameterSource params = new MapSqlParameterSource("id", id);
		
		return jdbc.update("delete from GENE_ANNOTATION where id=:id", params) == 1;
	}

	public Gene getGene(int id) {

		MapSqlParameterSource params = new MapSqlParameterSource();
		params.addValue("id", id);

		return jdbc.queryForObject("select * from GENE_ANNOTATION where id=:id", params,
				new RowMapper<Gene>() {

					public Gene mapRow(ResultSet rs, int rowNum)
							throws SQLException {
						Gene gene = new Gene();
						gene.setId(rs.getInt("id"));
						gene.setEntrez_gene_id(rs.getString("entrez_gene_id"));
						gene.setSummary(rs.getString("summary"));

						return gene;
					}

				});
	}
	
}
