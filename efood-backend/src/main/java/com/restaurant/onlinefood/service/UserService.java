package com.restaurant.onlinefood.service;

import com.restaurant.onlinefood.model.User;

public interface UserService {
    public User finduserByJwtToken(String jwt) throws Exception;
    public User findUserByEmail(String email) throws Exception;
}
