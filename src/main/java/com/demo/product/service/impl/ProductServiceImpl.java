/* 
 * Created by 2018年9月10日
 */
package com.demo.product.service.impl;

import java.util.List;

import com.demo.product.dao.ProductDao;
import com.demo.product.entity.Product;
import com.demo.product.service.ProductService;

/**
 * The implement of the product service.
 * @author fangang
 */
public class ProductServiceImpl implements ProductService {
	private ProductDao dao;
	
	/**
	 * @return the dao
	 */
	public ProductDao getDao() {
		return dao;
	}

	/**
	 * @param dao the dao to set
	 */
	public void setDao(ProductDao dao) {
		this.dao = dao;
	}

	@Override
	public void saveProduct(Product product) {
		dao.save(product);
	}

	@Override
	public void saveProductList(List<Product> listOfProducts) {
		dao.save(listOfProducts);
	}

	@Override
	public void deleteProduct(String id) {
		dao.deleteProduct(id);
	}
}
