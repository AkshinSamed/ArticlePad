package com.example.articlepad.service;

import com.example.articlepad.model.Author;

import java.util.Optional;

public interface AuthorService {
    Author saveAuthor(Author author);
    Optional<Author> findAuthorById(Long id);

    Author updateAuthor(Long id, Author authorDetails);

    void deleteAuthor(Long id);

}
