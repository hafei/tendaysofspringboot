package com.example.tendaysofspringboot.controller;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ValuesController {

        @GetMapping("/values")
        public String getValues() {
            return "Hello World";
        }
}
