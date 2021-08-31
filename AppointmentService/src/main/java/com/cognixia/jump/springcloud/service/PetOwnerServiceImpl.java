package com.cognixia.jump.springcloud.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cognixia.jump.springcloud.model.PetOwner;


@Component
public class PetOwnerServiceImpl implements PetOwnerService
{
	@Override
	public List<PetOwner> findByOwnerId(Integer appointmentId) {
		List<PetOwner> defaultList = new ArrayList<>();
		defaultList.add(new PetOwner());
        return defaultList;
	}
	
	@Override
	public PetOwner update(Integer ownerId, PetOwner petowner) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Integer ownerId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public PetOwner save(PetOwner petowner) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
