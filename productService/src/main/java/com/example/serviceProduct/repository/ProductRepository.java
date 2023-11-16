package com.example.serviceProduct.repository;

import com.example.serviceProduct.entity.Category;
import com.example.serviceProduct.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ProductRepository  extends JpaRepository<Product, Long> {
    public List<Product> findByCategory(Category category);
}

