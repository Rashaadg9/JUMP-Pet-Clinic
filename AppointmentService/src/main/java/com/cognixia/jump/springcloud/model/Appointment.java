package com.cognixia.jump.springcloud.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Table(name="APPOINTMENT")
@Entity
public class Appointment implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer appointmentId;
	
	@Column(name="DATE")
	Date date;
	
	@Column(name="PETOWNERID")
	Integer ownerId;
	
	@Transient
	List<PetOwner> petOwner;

	public Integer getAppointmentId() {
		return appointmentId;
	}

	public void setAppointmentId(Integer appointmentId) {
		this.appointmentId = appointmentId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Integer getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(Integer ownerId) {
		this.ownerId = ownerId;
	}

	public List<PetOwner> getPetOwner() {
		return petOwner;
	}

	public void setPetOwner(List<PetOwner> petOwner) {
		this.petOwner = petOwner;
	}

	@Override
	public String toString() {
		return "Appointment [appointmentId=" + appointmentId + ", date=" + date + ", ownerId=" + ownerId + ", petOwner="
				+ petOwner + "]";
	}

	
}
