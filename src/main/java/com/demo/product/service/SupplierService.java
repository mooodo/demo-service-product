/* 
 * Created by 2019年1月30日
 */
package com.demo.product.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.demo.product.entity.Supplier;
import com.demo.product.service.impl.SupplierServiceHystrixImpl;

/**
 * The service of supplier.
 * @author fangang
 */
@Service
@FeignClient(value="service-supplier",fallback=SupplierServiceHystrixImpl.class)
public interface SupplierService {
	/**
	 * load a supplier by id.
	 * @param id
	 * @return the supplier
	 */
	@GetMapping("supplier/get/supplierService/loadSupplier")
	public Supplier loadSupplier(@RequestParam(value="arg0") String id);
}
