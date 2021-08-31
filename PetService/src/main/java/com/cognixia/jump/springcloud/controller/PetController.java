package com.cognixia.jump.springcloud.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cognixia.jump.springcloud.model.Pet;
import com.cognixia.jump.springcloud.repository.PetRepository;

@RestController
public class PetController
{
	private static final Logger logger = LoggerFactory.getLogger(PetController.class);
	
	@Autowired
	private PetRepository petRepository;
	
	@GetMapping(value = "/pet")
	public Iterable<Pet> all() {
		logger.info("Find all pets information ");
		return petRepository.findAll();
	}
	
	@GetMapping(value = "/pet/{petId}")
	public Pet findByPetId(@PathVariable Integer petId) {
		logger.info("Find by Pet ID :" + petId);
		return petRepository.findPetByPetId(petId);
	}
	
	@GetMapping(value = "/pet/petOwner/{ownerId}")
	public Iterable<Pet> findByOwnerId(@PathVariable Integer ownerId) {
		logger.info("Find by Owner ID :" + ownerId);
		return petRepository.findAllByOwnerId(ownerId);
	}
	
	@PostMapping(value = "/pet")
	public Pet save(@RequestBody Pet pet) {
		return petRepository.save(pet);

	}
	
	@PutMapping(value = "/pet")
	public Pet update(@RequestBody Pet pet) {
		logger.info("Find by Pet :" + pet);
		return petRepository.save(pet);
	}
	
	@DeleteMapping(value = "/pet")
	public void delete(@RequestBody Pet pet) {
		logger.info("Find by Pet:" + pet);
		petRepository.delete(pet);
	}
}
