package com.springlab3.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springlab3.demo.model.Product;

public interface ProductJpaRepo  extends JpaRepository<Product,Integer>{

	
}
