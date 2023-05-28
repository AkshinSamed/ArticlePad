package com.example.articlepad;

import com.example.articlepad.model.Author;
import com.example.articlepad.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ArticlePadApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ArticlePadApplication.class, args);
	}

	@Autowired
	private AuthorRepository authorRepository;

	@Override
	public void run(String... args) {
		Author author = new Author("Anna", "Marnie", "annamarnie@gmail.com", "Anna_1103!@");
	}
}
