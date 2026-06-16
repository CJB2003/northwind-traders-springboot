package com.pluralsight.northwindtradersspringboot.repository;

import com.pluralsight.northwindtradersspringboot.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    Product findByCategoryId(int categoryId);
    Product findByUnitPrice(BigDecimal unitPrice);
    Product findByProductName(String productName);
}
