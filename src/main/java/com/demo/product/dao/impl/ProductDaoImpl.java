/* 
 * Created by 2018年9月10日
 */
package com.demo.product.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.demo.product.dao.ProductDao;
import com.demo.product.entity.Product;
import com.demo.product.repository.ProductRepository;

/**
 * The implement of the product dao.
 * @author fangang
 */
@Repository("productDao")
public class ProductDaoImpl implements ProductDao {
	private ProductRepository repository = ProductRepository.getInstance();
	
	@Override
	public void save(Product product) {
		repository.set(product);
	}

	@Override
	public void save(List<Product> listOfProducts) {
		repository.setAll(listOfProducts);
	}

	@Override
	public void deleteProduct(String id) {
		repository.del(id);
	}

	@Override
	public Product getProduct(String id) {
		return repository.get(id);
	}

	@Override
	public List<Product> listOfProducts() {
		return repository.list();
	}
}
