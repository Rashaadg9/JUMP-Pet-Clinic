package com.cognixia.jump.springcloud.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognixia.jump.springcloud.model.Pet;

@Repository
public interface PetRepository extends JpaRepository<Pet, Integer>
{
	List<Pet> findAllByOwnerId(Integer ownerId);
	Pet findPetByPetId(Integer petId);
}
