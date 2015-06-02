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

	public List<Gene> getOffers() {

		return jdbc.query("select * from offers", new RowMapper<Gene>() {

			public Gene mapRow(ResultSet rs, int rowNum) throws SQLException {
				Gene offer = new Gene();

				offer.setId(rs.getInt("id"));
				offer.setName(rs.getString("name"));
				offer.setText(rs.getString("text"));
				offer.setEmail(rs.getString("email"));

				return offer;
			}

		});
	}
	
	public boolean update(Gene offer) {
		BeanPropertySqlParameterSource params = new BeanPropertySqlParameterSource(offer);
		
		return jdbc.update("update offers set name=:name, text=:text, email=:email where id=:id", params) == 1;
	}
	
	public boolean create(Gene offer) {
		
		BeanPropertySqlParameterSource params = new BeanPropertySqlParameterSource(offer);
		
		return jdbc.update("insert into offers (name, text, email) values (:name, :text, :email)", params) == 1;
	}
	
	@Transactional
	public int[] create(List<Gene> offers) {
		
		SqlParameterSource[] params = SqlParameterSourceUtils.createBatch(offers.toArray());
		
		return jdbc.batchUpdate("insert into offers (id, name, text, email) values (:id, :name, :text, :email)", params);
	}
	
	public boolean delete(int id) {
		MapSqlParameterSource params = new MapSqlParameterSource("id", id);
		
		return jdbc.update("delete from offers where id=:id", params) == 1;
	}

	public Gene getOffer(int id) {

		MapSqlParameterSource params = new MapSqlParameterSource();
		params.addValue("id", id);

		return jdbc.queryForObject("select * from offers where id=:id", params,
				new RowMapper<Gene>() {

					public Gene mapRow(ResultSet rs, int rowNum)
							throws SQLException {
						Gene gene = new Gene();

						gene.setId(rs.getInt("id"));
						gene.setName(rs.getString("name"));
						gene.setText(rs.getString("text"));
						gene.setEmail(rs.getString("email"));

						return gene;
					}

				});
	}
	
}
