/* 
 * Created by 2018年9月10日
 */
package com.demo.product.dao.impl;

import java.util.Collection;

import org.springframework.stereotype.Repository;

import com.demo.product.dao.ProductDao;
import com.demo.product.entity.Product;

/**
 * The implement of the product dao.
 * @author fangang
 */
@Repository()
public class ProductDaoImpl implements ProductDao {
	private ProductFactory factory = ProductFactory.newInstance();
	
	@Override
	public void save(Product product) {
		factory.save(product);
	}

	@Override
	public void save(Collection<Product> listOfProducts) {
		for(Product product : listOfProducts) factory.save(product);
	}

	@Override
	public void deleteProduct(String id) {
		factory.delete(id);
	}

	@Override
	public Product getProduct(String id) {
		return factory.get(id);
	}

	@Override
	public Collection<Product> listOfProducts() {
		return factory.list();
	}
}
