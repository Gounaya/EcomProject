package com.product.service;

import java.util.List;

import com.product.model.Product;

public interface ProductService {
	
	public List<Product> listAll();
    public Product getById(Long id);

}
