/* 
 * Created by 2018年9月10日
 */
package com.demo.product.service;

import java.util.List;

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
	public void saveProduct(Product product);
	/**
	 * save a list of products.
	 * @param listOfProducts
	 */
	public void saveProductList(List<Product> listOfProducts);
	/**
	 * delete a product by id.
	 * @param id
	 */
	public void deleteProduct(String id);
}
