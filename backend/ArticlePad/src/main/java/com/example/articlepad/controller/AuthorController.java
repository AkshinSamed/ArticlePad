package com.example.articlepad.controller;

import com.example.articlepad.model.Author;
import com.example.articlepad.service.AuthorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:5173/")
@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class AuthorController {

    private final AuthorService authorService;

    @PostMapping("")
    public Author register(@RequestBody Author author) {

        return authorService.saveAuthor(author);
    }
}
