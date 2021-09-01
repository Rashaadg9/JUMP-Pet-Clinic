package com.cognixia.jump.springcloud.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.cognixia.jump.springcloud.model.Pet;


@Service
@FeignClient(name = "pet-service", fallback = PetServiceImpl.class)
public interface PetService
{
	@GetMapping(value = "/pet/petowner/{ownerId}")
	List<Pet> findByOwnerId(@PathVariable("ownerId") Integer ownerId);
	
	@PutMapping(value = "/pet/{petId}")
	Pet update(@PathVariable("petId") Integer petId,@RequestBody Pet pet);
	
	@DeleteMapping(value = "/pet/{petId}")
	void delete(@PathVariable("petId") Integer petId);
	
	@PostMapping(value = "/pet")
	Pet save(@RequestBody Pet pet);
}
