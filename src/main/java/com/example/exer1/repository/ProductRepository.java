package com.example.exer1.repository;

import com.example.exer1.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByPriceLessThan(Double price);

    List<Product> findByNameContaining(String name);
}
