package com.cognixia.jump.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cognixia.jump.springcloud.model.Pet;
import com.cognixia.jump.springcloud.model.PetOwner;
import com.cognixia.jump.springcloud.repository.PetOwnerRepository;
import com.cognixia.jump.springcloud.service.PetService;

@RestController
public class PetOwnerController
{
	@Autowired
	PetOwnerRepository petOwnerRepository;
	
	@Autowired
	PetService petService;
	
	@GetMapping(value = "/petowner")
	public Iterable<PetOwner> all()
	{

		List<PetOwner> petOwner = petOwnerRepository.findAll();

		for (PetOwner o : petOwner)
		{
			o.setPet(petService.findByOwnerId(o.getOwnerId()));
		}
		return petOwner;
	}
	
	@GetMapping(value = "/petowner/{ownerId}")
	public PetOwner findByOwnerId(@PathVariable Integer ownerId)
	{
		PetOwner petOwner = petOwnerRepository.findByOwnerId(ownerId);
		petOwner.setPet(petService.findByOwnerId(ownerId));
		return petOwner;
	}
	
	@PostMapping(value = "/petowner")
	public PetOwner save(@RequestBody PetOwner petOwner)
	{
		List<Pet> pets = petOwner.getPet();
		for (Pet pet : pets)
		{
			petService.save(pet);
		}
		PetOwner result = petOwnerRepository.save(petOwner);
		result.setPet(petService.findByOwnerId(result.getOwnerId()));
		return result;
	}
	
	@PutMapping(value = "/petowner")
	public PetOwner update(@RequestBody PetOwner petOwner)
	{
		return petOwnerRepository.save(petOwner);
	}
	
	@DeleteMapping(value = "/petowner")
	public void delete(@RequestBody PetOwner petOwner)
	{
		petOwnerRepository.delete(petOwner);
	}
}
