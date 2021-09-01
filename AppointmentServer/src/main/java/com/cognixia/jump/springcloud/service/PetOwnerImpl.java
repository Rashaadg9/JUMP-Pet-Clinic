package com.cognixia.jump.springcloud.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cognixia.jump.springcloud.model.PetOwner;

@Component
public class PetOwnerImpl implements PetOwnerService
{
	public PetOwner findByOwnerId(Integer ownerId)
	{
		PetOwner defaultOwner = new PetOwner();
		System.out.println("--------------------FALLBACK--------------------");
		return defaultOwner;
	}

	@Override
	public PetOwner update(PetOwner petOwner) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(PetOwner petOwner) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public PetOwner save(PetOwner petOwner) {
		// TODO Auto-generated method stub
		return null;
	}
}
