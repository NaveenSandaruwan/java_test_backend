package com.foodapp.repository;

import com.foodapp.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
