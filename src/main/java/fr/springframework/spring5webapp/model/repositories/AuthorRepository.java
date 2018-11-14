package fr.springframework.spring5webapp.model.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import fr.springframework.spring5webapp.model.Author;

@Service
public interface AuthorRepository extends CrudRepository<Author, Long>
{
}
