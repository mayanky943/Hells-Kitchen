package com.restaurant.onlinefood.service;

import com.restaurant.onlinefood.config.JwtProvider;
import com.restaurant.onlinefood.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService {
    private com.restaurant.onlinefood.repository.UserRepository userRepository;
    private JwtProvider jwtProvider;

    public UserServiceImp(com.restaurant.onlinefood.repository.UserRepository userRepository, JwtProvider jwtProvider) {
        this.userRepository = userRepository;
        this.jwtProvider = jwtProvider;
    }

    @Override
    public User findUserByJwtToken(String jwt) throws Exception {
        String email=jwtProvider.getEmailFromJwtToken(jwt);
        User user=findUserByEmail(email);
        return user;
    }

    @Override
    public User findUserByEmail(String email) throws Exception {
        User user=userRepository.findByEmail(email);
        if(user==null){
            throw new Exception("User not found");
        }
        return user;
    }
}
