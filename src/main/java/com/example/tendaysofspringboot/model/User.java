package com.example.tendaysofspringboot.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "users")
@JsonIgnoreProperties("_class")
public class User {
    private String name;
    private String email;
    private String password;
}
