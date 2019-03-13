package com.product.repository;

import java.util.Optional;

//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.product.model.Product;

@Repository("ProductRepository")
public interface ProductRepository extends CrudRepository<Product, Long>{

	Product findOne(Long id);
	//Product findById(Long id);
	
}
