package com.example.tendaysofspringboot.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "products")
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties("_class")
public class Product {
    @Id
    private String id;
    private String name;
    private String description;
    private String price;
    private String category;
    private String image;
}
