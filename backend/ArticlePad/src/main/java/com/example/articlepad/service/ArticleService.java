package com.example.articlepad.service;

import com.example.articlepad.model.Article;
import com.example.articlepad.model.Author;

import java.util.List;
import java.util.Optional;

public interface ArticleService {
    List<Article> getArticlesByAuthor(Author author);

    List<Article> getAllArticles();

    Optional<Article> getArticleByName(String header);

    Article saveArticle(Article article);
}
