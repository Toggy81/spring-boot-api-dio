package com.digitalinnovationone.personapi.controller;

import com.digitalinnovationone.personapi.dto.MessageResponseDTO;
import com.digitalinnovationone.personapi.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.digitalinnovationone.personapi.entity.Person;

@RestController
@RequestMapping("/api/v1/people")
public class PersonController {

	@Autowired
	private final PersonService personService;

	public PersonController(PersonService personService) {
		this.personService = personService;
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public MessageResponseDTO createPerson(@RequestBody Person person) {
		return personService.createPerson(person);
	}

}
