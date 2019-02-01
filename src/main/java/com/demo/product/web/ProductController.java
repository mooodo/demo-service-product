/* 
 * Created by 2018年9月10日
 */
package com.demo.product.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * The controller of products.
 * @author fangang
 */
@Controller
@RequestMapping("product")
public class ProductController {
	@GetMapping("show")
	public String show() {
		return "product/index";
	}
}
