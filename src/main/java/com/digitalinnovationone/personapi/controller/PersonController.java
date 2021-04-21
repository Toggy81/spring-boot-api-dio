package com.digitalinnovationone.personapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.digitalinnovationone.personapi.entity.Person;
import com.digitalinnovationone.repository.PersonRepository;

@RestController
@RequestMapping("/api/v1/people")
public class PersonController {
	
	
	private PersonRepository personRepository;	
	
	@Autowired
	public PersonController(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}

	@PostMapping
	public void createPerson(Person person) {
		personRepository.save(person);
	}

}
