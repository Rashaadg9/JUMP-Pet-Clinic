package com.cognixia.jump.springcloud;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cognixia.jump.springcloud.model.Appointment;
import com.cognixia.jump.springcloud.model.PetOwner;
import com.cognixia.jump.springcloud.repository.AppointmentRepository;
import com.cognixia.jump.springcloud.service.PetOwnerService;

@RestController
public class AppointmentController
{
	@Autowired
	AppointmentRepository appointmentRepository;
	
	@Autowired
	PetOwnerService petOwnerService;
	
	@GetMapping("/appointment")
	public Iterable<Appointment> all()
	{
		List<Appointment> appointment = appointmentRepository.findAll();
		
//		for(int i = 0; i < appointment.size(); i++)
//		{
//			appointment.get(i).setPetOwner(petOwnerService.findByOwnerId(appointment.get(i).getPetownerid()));
//		}
		for(Appointment a : appointment)
		{
			a.setPetOwner(petOwnerService.findByOwnerId(a.getPetownerid()));
		}
		return appointment;
	}
	
	@GetMapping("/appointment/{appointmentId}")
	public Appointment getAppointmentByAppointmetId(@PathVariable("appointmentId") Integer appointmentId)
	{
		Appointment result = appointmentRepository.findByAppointmentId(appointmentId);
		
		result.setPetOwner(petOwnerService.findByOwnerId(result.getPetownerid()));
		return result;
	}
	
	@PostMapping("/appointment")
	public Appointment save(@RequestBody Appointment appointment)
	{
		Appointment result = appointmentRepository.save(appointment);
		result.setPetOwner(petOwnerService.findByOwnerId(result.getPetownerid()));
		return result;
	}
	
	@PutMapping("/appointment")
	public Appointment update(@RequestBody Appointment appointment)
	{
		Appointment result = appointmentRepository.save(appointment);
		result.setPetOwner(petOwnerService.findByOwnerId(result.getPetownerid()));
		return result;
	}
	
	@DeleteMapping("/appointment/{appointmentId}")
	public void update(@PathVariable Integer appointmentId)
	{
		appointmentRepository.deleteById(appointmentId);
	}
}
