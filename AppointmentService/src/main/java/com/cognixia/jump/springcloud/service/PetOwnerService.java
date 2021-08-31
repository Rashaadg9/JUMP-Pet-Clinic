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

import com.cognixia.jump.springcloud.model.PetOwner;


@Service
@FeignClient(name = "petOwner-service", fallback = PetOwnerServiceImpl.class)
public interface PetOwnerService
{
	@GetMapping(value = "/petOwner/{ownerId}")
	List<PetOwner> findByOwnerId(@PathVariable("ownerId") Integer ownerId);
	
	@PutMapping(value = "/petOwner/{ownerId}")
	PetOwner update(@PathVariable("ownerId") Integer ownerId,@RequestBody PetOwner petowner);
	
	@DeleteMapping(value = "/petOwner/{ownerId}")
	void delete(@PathVariable("ownerId") Integer ownerId);
	
	@PostMapping(value = "/petOwner")
	PetOwner save(@RequestBody PetOwner petowner);
}
