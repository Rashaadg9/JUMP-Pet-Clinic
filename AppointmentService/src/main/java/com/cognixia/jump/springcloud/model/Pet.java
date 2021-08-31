package com.cognixia.jump.springcloud.model;

import java.io.Serializable;

public class Pet implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	Integer petId;
	
	String petName;
	
	String petFamily;
	
	String petType;
	
	double petAge;
	
	Integer ownerId;
	
	
	public Pet()
	{
		this(-1, "Generic Name", "Generic Family", "Generic Type", -0.0, -1);
	}
	
	public Pet(Integer petId, String petName, String petFamily, String petType, double petAge, Integer ownerId)
	{
		super();
		this.petId = petId;
		this.petName = petName;
		this.petFamily = petFamily;
		this.petType = petType;
		this.petAge = petAge;
		this.ownerId = ownerId;
	}
	
	
	public Integer getPetId() {
		return petId;
	}

	public void setPetId(Integer petId) {
		this.petId = petId;
	}

	public String getPetName() {
		return petName;
	}

	public void setPetName(String petName) {
		this.petName = petName;
	}

	public String getPetFamily() {
		return petFamily;
	}

	public void setPetFamily(String petFamily) {
		this.petFamily = petFamily;
	}

	public String getPetType() {
		return petType;
	}

	public void setPetType(String petType) {
		this.petType = petType;
	}

	public double getPetAge() {
		return petAge;
	}

	public void setPetAge(double petAge) {
		this.petAge = petAge;
	}

	public Integer getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(Integer ownerId) {
		this.ownerId = ownerId;
	}

	@Override
	public String toString() {
		return "Pet [petId=" + petId + ", petName=" + petName + ", petFamily=" + petFamily + ", petType=" + petType
				+ ", petAge=" + petAge + ", ownerId=" + ownerId + "]";
	}
	
}
