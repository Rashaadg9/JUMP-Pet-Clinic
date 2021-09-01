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
	
	@Column(name="petownerid")
	Integer petownerid;
	
	@Transient
	PetOwner petOwner;
	

	public Appointment()
	{
		super();
	}


	public Appointment(Integer appointmentId, Date date, Integer petownerid, PetOwner petOwner) {
		super();
		this.appointmentId = appointmentId;
		this.date = date;
		this.petownerid = petownerid;
		this.petOwner = petOwner;
	}



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

	public Integer getPetownerid() {
		return petownerid;
	}

	public void setPetownerid(Integer petownerid) {
		this.petownerid = petownerid;
	}
	
	public PetOwner getPetOwner() {
		return petOwner;
	}

	public void setPetOwner(PetOwner petOwner) {
		this.petOwner = petOwner;
	}

	@Override
	public String toString() {
		return "Appointment [appointmentId=" + appointmentId + ", date=" + date + ", petownerid=" + petownerid
				+ ", petOwner=" + petOwner + "]";
	}
	
	
	
}
