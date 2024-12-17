package com.foodapp.service;

import com.foodapp.models.Category;
import com.foodapp.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DatabaseCheckService {

    @Autowired
    private CategoryRepository categoryRepository;

    public void checkDatabaseConnection() {
        List<Category> categories = categoryRepository.findAll();
        if (categories.isEmpty()) {
            System.out.println("No categories found in the database.");
        } else {
            System.out.println("Database connection successful. Found " + categories.size() + " categories.");
            categories.forEach(category -> System.out.println("Category: " + category.getName()));
        }
    }
}
