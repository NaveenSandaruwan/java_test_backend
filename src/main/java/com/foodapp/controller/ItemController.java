package com.foodapp.controller;

import com.foodapp.models.Recommendation;
import com.foodapp.models.SearchItem;
import com.foodapp.models.PopularItem;
import com.foodapp.repository.PopularItemRepository;
import com.foodapp.repository.RecommendationRepository;
import com.foodapp.repository.SearchItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class ItemController {

    @Autowired
    private SearchItemRepository searchItemRepository;

    @Autowired
    private RecommendationRepository recommendationRepository;

    @Autowired
    private PopularItemRepository popularItemRepository;

    @GetMapping("/api/search-items")
    public List<SearchItem> getSearchItems() {
        return searchItemRepository.findAll();
    }

    @GetMapping("/api/recommendations")
    public List<Recommendation> getRecommendations() {
        return recommendationRepository.findAll();
    }

    @GetMapping("/api/popular-items")
    public List<PopularItem> getPopularItems() {
        return popularItemRepository.findAll();
    }
}
