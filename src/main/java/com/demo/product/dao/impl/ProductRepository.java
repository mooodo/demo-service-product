/*
 * Created by 2021-01-04 09:06:36 
 */
package com.demo.product.dao.impl;

import java.util.Collection;

import org.springframework.stereotype.Repository;

import com.demo.product.dao.ProductDao;
import com.demo.product.entity.Product;
import com.demo.support.dao.BasicRepository;

/**
 * @author fangang
 */
@Repository
public class ProductRepository extends BasicRepository<Product> implements ProductDao {
	public ProductRepository() {
		setClazz(Product.class);
		initFactory("product.xml");
	}

	@Override
	public void save(Product product) {
		super.save(product);
	}

	@Override
	public void save(Collection<Product> listOfProducts) {
		for(Product product : listOfProducts) save(product);
	}

	@Override
	public void deleteProduct(String id) {
		super.delete(id);
	}

	@Override
	public Product getProduct(String id) {
		return super.get(id);
	}

	@Override
	public Collection<Product> listOfProducts() {
		return super.list();
	}

}
