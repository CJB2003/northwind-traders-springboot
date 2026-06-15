package com.pluralsight.northwindtradersspringboot.service;

import com.pluralsight.northwindtradersspringboot.model.Product;
import com.pluralsight.northwindtradersspringboot.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {
    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> findAllProducts() {
        return productRepository.findAll().stream()
                .toList();
    }
    public Product findProductById(Long id) {
        return productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Product with ID " + id + " not found."));
    }

    public Product addProduct(Long id, Product product) {
        Product newProduct = findProductById(id);
        newProduct.setName(product.getName());
        newProduct.setCategory(product.getCategory());
        newProduct.setPrice(product.getPrice());
        return productRepository.save(newProduct);
    }

    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}
