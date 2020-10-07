/* 
 * Created by 2018年9月10日
 */
package com.demo.product.service.impl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.product.dao.ProductDao;
import com.demo.product.entity.Product;
import com.demo.product.entity.Supplier;
import com.demo.product.service.ProductService;
import com.demo.product.service.SupplierService;

/**
 * The implement of the product service.
 * @author fangang
 */
@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductDao dao;
	@Autowired
	private SupplierService supplierService;

	@Override
	public void save(Product product) {
		dao.save(product);
	}

	@Override
	public void saveAll(Collection<Product> listOfProducts) {
		dao.save(listOfProducts);
	}

	@Override
	public void delete(String id) {
		dao.deleteProduct(id);
	}

	@Override
	public Product get(String id) {
		Product product = dao.getProduct(id);
		String supplierId = product.getSupplierId();
		Supplier supplier = supplierService.loadSupplier(supplierId);
		product.setSupplier(supplier);
		return product;
	}
}
