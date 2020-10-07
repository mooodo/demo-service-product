/* 
 * Created by 2019年1月29日
 */
package com.demo.product.query.dao;

import java.util.Collection;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.demo.product.dao.impl.ProductFactory;
import com.demo.support.dao.QueryDao;

/**
 * The implement of the query dao for products.
 * @author fangang
 */
@Repository("productQueryDao")
public class ProductQueryDaoImpl implements QueryDao {
	private ProductFactory factory = ProductFactory.newInstance();
	@Override
	public Collection<?> query(Map<String, Object> params) {
		return factory.list();
	}

	@Override
	public long count(Map<String, Object> params) {
		return factory.list().size();
	}

	@Override
	public Map<String, Object> aggregate(Map<String, Object> params) {
		// TODO Auto-generated method stub
		return null;
	}

}
