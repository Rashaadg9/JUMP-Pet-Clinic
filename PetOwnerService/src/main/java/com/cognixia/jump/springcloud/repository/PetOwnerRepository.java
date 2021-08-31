package com.cognixia.jump.springcloud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognixia.jump.springcloud.model.PetOwner;

@Repository
public interface PetOwnerRepository extends JpaRepository<PetOwner, Integer>
{
	PetOwner findByOwnerId(Integer ownerId);;
}
