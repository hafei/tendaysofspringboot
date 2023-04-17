package com.example.tendaysofspringboot.service;

import com.example.tendaysofspringboot.model.User;
import com.github.javafaker.Faker;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.AutoPopulatingList;

import java.util.List;

@Service
public class UserService {

    private final Faker faker;
    private final MongoTemplate mongoTemplate;
    public UserService(Faker faker, MongoTemplate mongoTemplate) {
        this.faker = faker;
        this.mongoTemplate = mongoTemplate;
    }

    public List<User> getAllUsers() {
        // generate 10 users with fake data
        List<User> users = new AutoPopulatingList<>(User.class);

        // generate 10 users with fake data
        for (int i = 0; i < 10; i++) {
            users.add(new User(){
                {
                    setName(faker.name().fullName());
                    setEmail(faker.internet().emailAddress());
                    setPassword(faker.internet().password());
                }
            });
        }
        mongoTemplate.insertAll(users);
        return users;
    }
    public List<User> findAll(){
        return mongoTemplate.findAll(User.class);
    }
}
