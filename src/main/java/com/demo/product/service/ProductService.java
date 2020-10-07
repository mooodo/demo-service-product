/* 
 * Created by 2018年9月10日
 */
package com.demo.product.service;

import java.util.Collection;

import com.demo.product.entity.Product;

/**
 * The service of products.
 * @author fangang
 */
public interface ProductService {
	/**
	 * save a product.
	 * @param product
	 */
	public void save(Product product);
	/**
	 * save a list of products.
	 * @param listOfProducts
	 */
	public void saveAll(Collection<Product> listOfProducts);
	/**
	 * delete a product by id.
	 * @param id
	 */
	public void delete(String id);
	
	/**
	 * @param id
	 * @return the product with its id.
	 */
	public Product get(String id);
}
