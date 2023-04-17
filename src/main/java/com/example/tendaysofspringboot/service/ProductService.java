package com.example.tendaysofspringboot.service;

import com.example.tendaysofspringboot.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {
    private final MongoTemplate mongoTemplate;
    public ProductService(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    public void createCollection() {
        if (!mongoTemplate.collectionExists("products")) {
            mongoTemplate.createCollection("products");
        }
    }

    public void dropCollection() {
        if (mongoTemplate.collectionExists("products")) {
            mongoTemplate.dropCollection("products");
        }
    }

    public void insert() {
        mongoTemplate.insert(new Product());
    }

    public void insertAll(List<Product> products) {
        mongoTemplate.insertAll(products);
    }

    public List<Product> getAllProducts() {
        return mongoTemplate.findAll(Product.class, "products");
    }

    public Product findOne(){
        return mongoTemplate.findOne(null, Product.class, "products");
    }
}
