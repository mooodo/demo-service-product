/*
 * Created by 2020-06-25 21:58:40 
 */
package com.demo.product.dao.impl;

import com.demo.product.entity.Product;
import com.demo.support.dao.GenericFactory;

/**
 * @author fangang
 */
public class ProductFactory extends GenericFactory<Product> {
	private static ProductFactory factory;
	public static synchronized ProductFactory newInstance() {
		if(factory!=null) return factory;
		ProductFactory instance = new ProductFactory();
		instance.setClazz(Product.class);
		instance.initFactory("product.xml");
		factory = instance;
		return factory;
	}
}
