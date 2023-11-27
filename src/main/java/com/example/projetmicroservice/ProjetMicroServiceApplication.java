package com.example.projetmicroservice;

import com.example.projetmicroservice.Entities.Article;
import com.example.projetmicroservice.Repositories.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ProjetMicroServiceApplication implements CommandLineRunner {

    @Autowired
    private ArticleRepository articleRepository;

    public static void main(String[] args) {
        SpringApplication.run(ProjetMicroServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // La méthode run est désormais vide
    }
}
