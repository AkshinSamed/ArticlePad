package com.example.articlepad.service.implement;

import com.example.articlepad.exception.ResourceNotFoundException;
import com.example.articlepad.model.Author;
import com.example.articlepad.repository.AuthorRepository;
import com.example.articlepad.service.AuthorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AuthorServiceImplement implements AuthorService {

    private final AuthorRepository authorRepository;

    @Override
    public Author saveAuthor(Author author) {
        return authorRepository.save(author);
    }

    @Override
    public Optional<Author> findAuthorById(Long id) {
        return authorRepository.findById(id);
    }

    @Override
    public Author updateAuthor(Long id, Author authorDetails) throws ResourceNotFoundException {
        Author author = authorRepository
                .findById(id)
                .orElseThrow(
                        () -> new ResourceNotFoundException("Author not exist with Id: " + id));
        author.setName(authorDetails.getName());
        author.setSurname(authorDetails.getSurname());
        author.setPassword(authorDetails.getPassword());

        authorRepository.save(author);

        return author;
    }

    @Override
    public void deleteAuthor(Long id) throws ResourceNotFoundException {
        Author author = authorRepository
                .findById(id)
                .orElseThrow(
                        () -> new ResourceNotFoundException("Author not exist with Id: " + id));
        authorRepository.delete(author);
    }
}
