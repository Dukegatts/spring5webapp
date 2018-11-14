package fr.springframework.spring5webapp.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import fr.springframework.spring5webapp.model.Author;
import fr.springframework.spring5webapp.model.Book;
import fr.springframework.spring5webapp.model.Publisher;
import fr.springframework.spring5webapp.model.repositories.AuthorRepository;
import fr.springframework.spring5webapp.model.repositories.BookRepository;
import fr.springframework.spring5webapp.model.repositories.PublisherRepository;

@Component
public class DevBootStrap
	implements ApplicationListener<ContextRefreshedEvent>
{
	private AuthorRepository authorRepository;

	private BookRepository bookRepository;

	private PublisherRepository publisherRepository;

	public DevBootStrap(final AuthorRepository authorRepository,
						final BookRepository bookRepository,
						final PublisherRepository publisherRepository)
	{
		this.authorRepository = authorRepository;
		this.bookRepository = bookRepository;
		this.publisherRepository = publisherRepository;
	}

	@Override
	public void onApplicationEvent(final ContextRefreshedEvent contextRefreshedEvent)
	{
		initData();
	}

	private void initData()
	{
		//Eric
		Author eric = new Author("Eric", "Evans");
		Publisher harper = new Publisher("Harper Collins", "24 rue Monteil");
		Book ddd = new Book("Domain Driven Design", "1234", harper);
		eric.getBooks().add(ddd);
		ddd.getAuthors().add(eric);

		authorRepository.save(eric);
		publisherRepository.save(harper);
		bookRepository.save(ddd);

		//Rod
		Author rod = new Author("Rod", "Johnson");
		Publisher worx = new Publisher("Worx", "12 rue de la Paix");
		Book noEJB = new Book("J2EE Development without EJB", "23444", worx);
		rod.getBooks().add(noEJB);

		authorRepository.save(rod);
		publisherRepository.save(worx);
		bookRepository.save(noEJB);
	}
}
