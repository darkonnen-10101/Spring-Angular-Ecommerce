package com.darkonnen.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.darkonnen.ecommerce.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
