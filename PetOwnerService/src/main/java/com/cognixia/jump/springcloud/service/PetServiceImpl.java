package com.cognixia.jump.springcloud.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cognixia.jump.springcloud.model.Pet;


@Component
public class PetServiceImpl implements PetService
{

	@Override
	public List<Pet> findByOwnerId(Integer ownerId) {
		List<Pet> defaultList = new ArrayList<>();
		defaultList.add(new Pet(-1, "UNKNOWN FALLBACK NAME","UNKNOWN FAMILY", "UNKNOWN TYPE", -0.0, -1));
        return defaultList;
	}

	@Override
	public Pet update(Integer petId, Pet pet) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Integer petId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Pet save(Pet pet) {
		// TODO Auto-generated method stub
		return null;
	}

}
