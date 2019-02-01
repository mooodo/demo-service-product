/* 
 * Created by 2019年1月29日
 */
package com.demo.product.query.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.demo.product.repository.ProductRepository;
import com.demo.support.dao.QueryDao;

/**
 * The implement of the query dao for products.
 * @author fangang
 */
@Repository("productQueryDao")
public class ProductQueryDaoImpl implements QueryDao {
	private ProductRepository repository = ProductRepository.getInstance();
	@Override
	public List<?> query(Map<String, Object> params) {
		return repository.list();
	}

	@Override
	public long count(Map<String, Object> params) {
		return repository.size();
	}

	@Override
	public Map<String, Object> aggregate(Map<String, Object> params) {
		// TODO Auto-generated method stub
		return null;
	}

}
