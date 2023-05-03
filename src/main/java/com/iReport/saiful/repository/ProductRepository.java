package com.iReport.saiful.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iReport.saiful.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	public List<Product> findByName(String name);

}
