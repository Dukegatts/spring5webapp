package fr.springframework.spring5webapp.model.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import fr.springframework.spring5webapp.model.Publisher;


@Service
public interface PublisherRepository extends CrudRepository<Publisher, Long>
{
}
