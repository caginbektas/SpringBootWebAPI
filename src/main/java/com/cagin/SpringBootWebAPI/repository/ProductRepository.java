package com.cagin.SpringBootWebAPI.repository;

import com.cagin.SpringBootWebAPI.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
