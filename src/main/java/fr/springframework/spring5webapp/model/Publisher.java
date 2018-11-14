package fr.springframework.spring5webapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Publisher
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String name;

	private String adress;

	public Publisher(final String name, final String adress)
	{
		this.name = name;
		this.adress = adress;
	}

	public Publisher()
	{
	}

	public Long getId()
	{
		return id;
	}

	public void setId(final Long id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(final String name)
	{
		this.name = name;
	}

	public String getAdress()
	{
		return adress;
	}

	public void setAdress(final String adress)
	{
		this.adress = adress;
	}
}
