package com.restaurant.onlinefood.service;

import com.restaurant.onlinefood.dto.RestaurantDto;
import com.restaurant.onlinefood.model.Restaurant;
import com.restaurant.onlinefood.model.User;
import com.restaurant.onlinefood.request.CreateRestaurantRequest;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RestaurantService {
    public Restaurant createRestaurant(CreateRestaurantRequest req, User user);
    public Restaurant updateRestaurant(Long restaurantId,CreateRestaurantRequest updateRestaurant) throws Exception;
    public void deleteRestaurant(Long restaurantId) throws Exception;
    public List<Restaurant> getAllRestaurant();
    public List<Restaurant> searchRestaurant(String keyword);
    public Restaurant findRestaurantById(Long id) throws Exception;
    public Restaurant getRestaurantByUserId(Long userId) throws Exception;
    public RestaurantDto addToFavorites(Long restaurantId,User user) throws Exception;
    public Restaurant updateRestaurantStatus(Long id) throws Exception;

}
