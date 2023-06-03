package com.example.articlepad.repository;

import com.example.articlepad.model.Article;
import com.example.articlepad.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ArticleRepository extends JpaRepository<Article, Long> {

    List<Article> findArticleByAuthor(Author author);
    Optional<Article> findArticleByHeader(String header);
}
