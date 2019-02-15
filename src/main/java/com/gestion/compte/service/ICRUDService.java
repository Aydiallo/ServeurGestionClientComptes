package com.gestion.compte.service;

import java.util.List;

public interface ICRUDService<T, ID> {

	List<T> getAll() ;
	
	void add(T entity);
	
	void update(T entity);
	
	void delete(ID id);
	
	
}
