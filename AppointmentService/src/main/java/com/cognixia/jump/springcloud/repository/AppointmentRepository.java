package com.cognixia.jump.springcloud.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognixia.jump.springcloud.model.Appointment;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Integer>
{
	Appointment findByAppointmentId(Integer appointmentId);
}
