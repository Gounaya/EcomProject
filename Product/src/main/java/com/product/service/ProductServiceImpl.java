package com.product.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.model.Product;
import com.product.repository.ProductRepository;

@Service("ProductService")
public class ProductServiceImpl implements ProductService{

    private ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    
	@Override
	public List<Product> listAll() {
		List<Product> products = new ArrayList<>();
        productRepository.findAll().forEach(products::add);
        return products;
	}

	@Override
	public Product getById(Long id) {
        return productRepository.findOne(id);
	}

	
	
}
