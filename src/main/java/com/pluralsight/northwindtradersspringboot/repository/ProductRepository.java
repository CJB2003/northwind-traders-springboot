package com.pluralsight.northwindtradersspringboot.repository;

import com.pluralsight.northwindtradersspringboot.model.Category;
import com.pluralsight.northwindtradersspringboot.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

    Product findByCategory(Category category);
    Product findByUnitPrice(BigDecimal unitPrice);
    Product findByProductName(String productName);
}
