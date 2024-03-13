package com.restaurant.onlinefood.service;

import com.restaurant.onlinefood.model.Category;
import com.restaurant.onlinefood.model.Food;
import com.restaurant.onlinefood.model.Restaurant;
import com.restaurant.onlinefood.request.CreateFoodRequest;

import java.util.List;

public interface FoodService {
    public Food createFood(CreateFoodRequest req, Category category, Restaurant restaurant);
    void deleteFood(Long foodId) throws Exception;
    public List<Food> getRestaurantsFood(Long restaurantId, boolean isVegetarian, boolean isNonveg,boolean isSeasonal,String foodCategory);

    public List<Food> searchFood(String keyword);
    public Food findFoodById(Long foodId) throws Exception;
    public Food updateAvailabilityStatus(Long foodId) throws Exception;

}
