package com.packt.webstore.domain.repository.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.packt.webstore.domain.Product;
import com.packt.webstore.domain.repository.ProductRepository;

public class InMemoryProductRepository implements ProductRepository{

	//CONTINUE HERE, WRITE BUILDER FROM PRODUCTMAPPER CLASS, 
	//CHECK JDBC TEMPLATE
	
	
	@Override
	public List<Product> getAllProducts() {
		Map<String, Object> params  = new HashMap<String, Object>();
		List <Product> result = jdbcTemplate.query("SELECT * FROM products", params, new ProductMapper());
		return result;
	}
	
	private static final class ProductMapper implements RowMapper<Product> {

		@Override
		public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
			
			return null;
		}
		
		
		return product;
	}
	
	

}
