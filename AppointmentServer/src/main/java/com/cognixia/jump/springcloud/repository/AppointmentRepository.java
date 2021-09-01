package com.cognixia.jump.springcloud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import com.cognixia.jump.springcloud.model.Appointment;
import com.cognixia.jump.springcloud.model.PetOwner;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Integer>
{
	Appointment findByAppointmentId(Integer appointmentId);
}
