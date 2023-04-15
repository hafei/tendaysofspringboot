package com.example.tendaysofspringboot.service;

import com.example.tendaysofspringboot.model.User;
import org.springframework.stereotype.Service;
import org.springframework.util.AutoPopulatingList;

import java.util.Arrays;
import java.util.List;

@Service
public class UserService {
    public List<User> getAllUsers() {
        // generate 10 users with fake data
        List<User> users = new AutoPopulatingList<>(User.class);

        // generate 10 users with fake data
        for (int i = 0; i < 10; i++) {
            int finalI = i;
            users.add(new User(){
                {
                    setName("User " + finalI);
                    setEmail("user" + finalI + "@example.com");
                    setPassword("password" + finalI);
                }
            });
        }
        return users;
    }
}
