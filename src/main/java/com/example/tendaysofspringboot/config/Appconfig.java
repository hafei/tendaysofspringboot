package com.example.tendaysofspringboot.config;

import com.github.javafaker.Faker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Appconfig {
    @Bean
    public Faker faker() {
        return SingletonFaker.INSTANCE.getFaker();
    }

    private enum SingletonFaker {
        INSTANCE;

        private final Faker faker;

        SingletonFaker() {
            faker = new Faker();
        }

        public Faker getFaker() {
            return faker;
        }
    }
}
