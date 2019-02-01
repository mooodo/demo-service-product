/* 
 * Created by 2018年9月9日
 */
package com.demo.product.repository;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The abstract repository for all kinds of entities.
 * @author fangang
 */
public abstract class AbstractRepository<T extends Object> {
	protected Map<Serializable, T> map = new HashMap<Serializable, T>();
	protected AbstractRepository() {}
	
	/**
	 * initialize the repository.
	 */
	protected abstract void initialize();
	
	protected abstract void put(T t);
	/**
	 * @param t
	 */
	public void set(T t) {
		if(map.isEmpty()) initialize();
		put(t);
	}
	/**
	 * @param list
	 */
	public void setAll(List<T> list) {
		for(T t : list) put(t);
	}
	/**
	 * @param id
	 * @return
	 */
	public T get(Serializable id) {
		if(map.isEmpty()) initialize();
		return map.get(id);
	}
	/**
	 * @param id
	 */
	public void del(Serializable id) {
		if(map.isEmpty()) initialize();
		map.remove(id);
	}
	
	/**
	 * @return
	 */
	public List<T> list() {
		if(map.isEmpty()) initialize();
		List<T> list = new ArrayList<T>();
		for(Serializable id : map.keySet()) {
			list.add(get(id));
		}
		return list;
	}
	
	/**
	 * @return
	 */
	public long size() {
		return map.size();
	}
}
