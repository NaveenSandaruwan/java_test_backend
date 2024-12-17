package com.foodapp.controller;

import com.foodapp.models.Category;
import com.foodapp.repository.CategoryRepository;
import com.foodapp.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoryController {

    @Autowired
    private CategoryRepository categoryRepository;

    @GetMapping("/api/categories")
    public List<Category> getCategories() {
        return categoryRepository.findAll();
    }
}
