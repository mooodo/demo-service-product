/* 
 * Created by 2019年1月31日
 */
package com.demo.product.service.impl;

import org.springframework.stereotype.Component;

import com.demo.product.entity.Supplier;
import com.demo.product.service.SupplierService;

/**
 * The implement of the supplier service for hystrix fallback method.
 * @author fangang
 */
@Component
public class SupplierServiceHystrixImpl implements SupplierService {

	@Override
	public Supplier loadSupplier(String id) {
		Supplier supplier = new Supplier();
		supplier.setId(id);
		supplier.setName("默认供应商");
		return supplier;
	}

}
