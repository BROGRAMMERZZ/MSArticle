package com.example.projetmicroservice.Repositories;

import com.example.projetmicroservice.Entities.Article;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ArticleRepository extends MongoRepository<Article, String> {

}
