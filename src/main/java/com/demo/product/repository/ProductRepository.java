/* 
 * Created by 2018年9月10日
 */
package com.demo.product.repository;

import com.demo.product.entity.Product;

/**
 * The Repository for Product.
 * @author fangang
 */
public class ProductRepository extends AbstractRepository<Product> {
	private static ProductRepository repository = null;
	protected ProductRepository() {}
	public static ProductRepository getInstance() {
		if(repository==null)
			repository = new ProductRepository();
		return repository;
	}
	
	@Override
	protected void initialize() {
		Product nodebook = new Product("P00001","笔记本电脑",4000.00,"台","S0001","电子产品");
		put(nodebook);
		Product printer = new Product("P00002","打印机",2600.00,"台","S0001","电子产品");
		put(printer);
		Product node = new Product("P00003","记事本",2.00,"本","S0002","办公用品");
		put(node);
		Product computor = new Product("P00004","计算器",26.00,"个","S0002","办公用品");
		put(computor);
		Product pencil = new Product("P00005","签字笔",50.00,"盒","S0002","办公用品");
		put(pencil);
	}
	@Override
	protected void put(Product t) {
		map.put(t.getId(), t);
	}
}