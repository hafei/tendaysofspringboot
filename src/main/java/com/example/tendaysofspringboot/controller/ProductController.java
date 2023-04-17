package com.example.tendaysofspringboot.controller;

import com.example.tendaysofspringboot.model.Product;
import com.example.tendaysofspringboot.service.ProductService;
import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.AutoPopulatingList;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    private final Faker faker;

    private final ProductService productService;

    public ProductController(Faker faker, ProductService productService) {
        this.faker = faker;
        this.productService = productService;
    }

    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/init")
    public void initProducts() {
        productService.createCollection();
        List<Product> products = new AutoPopulatingList<>(Product.class);
        for (int i = 0; i < 10; i++){
            products.add(new Product(){
                {
                    setName(faker.commerce().productName());
                    setDescription(faker.lorem().sentence());
                    setPrice(faker.commerce().price());
                    setCategory(faker.commerce().department());
                    setImage(faker.internet().image());
                }
            });
        }
        productService.insertAll(products);
    }

    @GetMapping("/one")
    public Product getOne(){
        return productService.findOne();
    }
}
