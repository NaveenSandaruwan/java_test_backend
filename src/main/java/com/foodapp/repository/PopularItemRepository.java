package com.foodapp.repository;

import com.foodapp.models.PopularItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PopularItemRepository extends JpaRepository<PopularItem, Integer> {
}
