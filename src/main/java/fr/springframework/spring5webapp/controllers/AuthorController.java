package fr.springframework.spring5webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.springframework.spring5webapp.model.repositories.AuthorRepository;

@Controller
public class AuthorController
{
	private AuthorRepository authorRepository;

	public AuthorController(final AuthorRepository authorRepository)
	{
		this.authorRepository = authorRepository;
	}

	@RequestMapping("/authors")
	public String getBooks(Model model)
	{
		model.addAttribute("authors", authorRepository.findAll());

		return "authors";
	}
}
