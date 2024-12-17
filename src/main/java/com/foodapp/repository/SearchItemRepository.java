package com.foodapp.repository;

import com.foodapp.models.SearchItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SearchItemRepository extends JpaRepository<SearchItem, Integer> {
}
