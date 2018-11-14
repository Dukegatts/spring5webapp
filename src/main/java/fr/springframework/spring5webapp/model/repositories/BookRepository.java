package fr.springframework.spring5webapp.model.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import fr.springframework.spring5webapp.model.Book;

@Service
public interface BookRepository extends CrudRepository<Book, Long>
{
}
