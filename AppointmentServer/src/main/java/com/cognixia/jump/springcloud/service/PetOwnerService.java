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
@FeignClient(name = "petowner-service", fallback = PetOwnerImpl.class)
public interface PetOwnerService
{
	@GetMapping("/petowner/{ownerId}")
	PetOwner findByOwnerId(@PathVariable("ownerId") Integer ownerId);
	
	@PutMapping(value = "/petowner")
	PetOwner update(@RequestBody PetOwner petOwner);
	
	@DeleteMapping(value = "/petowner")
	void delete(@RequestBody PetOwner petOwner);
	
	@PostMapping(value = "/petowner")
	PetOwner save(@RequestBody PetOwner petOwner);
}
