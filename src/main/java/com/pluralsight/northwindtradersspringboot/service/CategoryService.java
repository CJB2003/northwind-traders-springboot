package com.pluralsight.northwindtradersspringboot.service;

import com.pluralsight.northwindtradersspringboot.model.Category;
import com.pluralsight.northwindtradersspringboot.repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    List<Category> getAllCategories(){
        return categoryRepository.findAll();
    }

    public Optional<Category> getSessionById(int id) {
        return categoryRepository.findById(id);
    }
}