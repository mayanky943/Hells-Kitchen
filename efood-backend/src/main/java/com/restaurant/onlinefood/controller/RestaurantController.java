package com.restaurant.onlinefood.controller;

import com.restaurant.onlinefood.dto.RestaurantDto;
import com.restaurant.onlinefood.model.Restaurant;
import com.restaurant.onlinefood.model.User;
import com.restaurant.onlinefood.request.CreateRestaurantRequest;
import com.restaurant.onlinefood.service.RestaurantService;
import com.restaurant.onlinefood.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/restaurants")
public class RestaurantController {
    @Autowired
    private RestaurantService restaurantService;
    @Autowired
    private UserService userService;

    @GetMapping("/search")
    public ResponseEntity<List<Restaurant>> searchRestaurant(
            @RequestHeader("Authorization") String jwt,
            @RequestParam String keyword
    ) throws Exception {
        User user=userService.findUserByJwtToken(jwt);
        List<Restaurant> restaurants=restaurantService.searchRestaurant(keyword);
        return new ResponseEntity<>(restaurants, HttpStatus.OK);
    }
    @GetMapping()
    public ResponseEntity<List<Restaurant>> getAllRestaurant(
            @RequestHeader("Authorization") String jwt
    ) throws Exception {
        User user=userService.findUserByJwtToken(jwt);
        List<Restaurant> restaurants=restaurantService.getAllRestaurant();
        return new ResponseEntity<>(restaurants, HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Restaurant> getRestaurantById(
            @RequestHeader("Authorization") String jwt,
            @PathVariable Long id
    ) throws Exception {
        User user=userService.findUserByJwtToken(jwt);
        Restaurant restaurants=restaurantService.findRestaurantById(id);
        return new ResponseEntity<>(restaurants, HttpStatus.OK);
    }
    @PutMapping("/{id}/add-favorites")
    public ResponseEntity<RestaurantDto> addToFavorites(
            @RequestHeader("Authorization") String jwt,
            @PathVariable Long id
    ) throws Exception {
        User user=userService.findUserByJwtToken(jwt);
        RestaurantDto restaurant=restaurantService.addToFavorites(id,user);
        return new ResponseEntity<>(restaurant, HttpStatus.OK);
    }
}
