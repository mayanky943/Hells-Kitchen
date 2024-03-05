package com.restaurant.onlinefood.controller;

import com.restaurant.onlinefood.model.Restaurant;
import com.restaurant.onlinefood.service.RestaurantService;
import com.restaurant.onlinefood.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/admin/restaurants")
public class AdminRestaurantController {
    private RestaurantService restaurantService;

    private UserService userService;
}
