package com.example.articlepad.service.implement;

import com.example.articlepad.model.Author;
import com.example.articlepad.repository.AuthorRepository;
import com.example.articlepad.service.AuthorService;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImplement implements AuthorService {

    private AuthorRepository authorRepository;

    public AuthorServiceImplement(AuthorRepository authorRepository){
        this.authorRepository = authorRepository;
    }
    @Override
    public Author saveAuthor(Author author) {
        return null;
    }

    @Override
    public Author getAuthorById(Long id) {
        return null;
    }
}
