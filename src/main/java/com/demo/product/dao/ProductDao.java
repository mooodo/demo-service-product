/* 
 * Created by 2018年9月10日
 */
package com.demo.product.dao;

import java.util.List;

import com.demo.product.entity.Product;

/**
 * The dao of the product
 * @author fangang
 */
public interface ProductDao {
	/**
	 * @param product
	 * @return
	 */
	public void save(Product product);
	/**
	 * @param listOfProducts
	 */
	public void save(List<Product> listOfProducts);
	/**
	 * @param id
	 */
	public void deleteProduct(String id);
	/**
	 * @param id
	 * @return product
	 */
	public Product getProduct(String id);
	/**
	 * @return list all of the products.
	 */
	public List<Product> listOfProducts();
}
