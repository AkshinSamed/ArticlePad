package com.example.articlepad.service.implement;

import com.example.articlepad.model.Article;
import com.example.articlepad.model.Author;
import com.example.articlepad.repository.ArticleRepository;
import com.example.articlepad.service.ArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ArticleServiceImplement implements ArticleService {

    private final ArticleRepository articleRepository;

    @Override
    public List<Article> getArticlesByAuthor(Author author) {
        return articleRepository.findArticleByAuthor(author);
    }

    @Override
    public List<Article> getAllArticles() {
        return articleRepository.findAll();
    }

    @Override
    public Optional<Article> getArticleByName(String header) {
        return articleRepository.findArticleByHeader(header);
    }

    @Override
    public Article saveArticle(Article article) {
        return articleRepository.save(article);
    }

}
