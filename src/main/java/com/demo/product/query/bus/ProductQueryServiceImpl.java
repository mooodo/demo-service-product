/* 
 * Created by 2019年1月29日
 */
package com.demo.product.query.bus;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.demo.product.entity.Product;
import com.demo.product.entity.Supplier;
import com.demo.product.service.SupplierService;
import com.demo.support.entity.ResultSet;
import com.demo.support.service.impl.QueryServiceImpl;

/**
 * The implement of the query service for products.
 * @author fangang
 */
public class ProductQueryServiceImpl extends QueryServiceImpl {
	@Autowired
	private SupplierService supplierService;

	@Override
	protected ResultSet afterQuery(Map<String, Object> params,
			ResultSet resultSet) {
		@SuppressWarnings("unchecked")
		List<Product> list = (List<Product>)resultSet.getData();
		for(Product product : list) {
			String supplierId = product.getSupplierId();
			Supplier supplier = supplierService.loadSupplier(supplierId);
			product.setSupplier(supplier);
		}
		resultSet.setData(list);
		return resultSet;
	}
	
}
