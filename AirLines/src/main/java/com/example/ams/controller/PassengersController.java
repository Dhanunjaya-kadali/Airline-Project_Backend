package com.example.ams.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ams.beans.Passengers;
import com.example.ams.services.PassengerServiceImpl;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/pas")
public class PassengersController {
	
	@Autowired
	PassengerServiceImpl pasService;
	
	   //http://localhost:8181/ret/retailers
		@GetMapping("/passengers")
		public List<Passengers> listAllPassengers()
		{
			
			return pasService.listAllPassengers();
		}

		//http://localhost:8191/pas/passengers/P01
		@GetMapping("/passengers/{id}")
		public Passengers findPassengerById(@PathVariable(value="id") String passId)
		{
		return pasService.findPassengerById(passId);
		}
		
		//http://localhost:8191/pas/addnewpassenger
		@PostMapping("/addnewpassenger")
		public void addPassengers(@RequestBody Passengers p) {
			pasService.addPassengers(p);
			
		}
		
		
		
	}