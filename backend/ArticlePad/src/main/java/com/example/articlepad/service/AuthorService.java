package com.example.articlepad.service;

import com.example.articlepad.model.Author;

public interface AuthorService {
    Author saveAuthor(Author author);
    Author getAuthorById(Long id);

}
