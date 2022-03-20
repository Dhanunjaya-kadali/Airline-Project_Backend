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

import com.example.ams.beans.Admin;
import com.example.ams.beans.Flight;
import com.example.ams.services.FlightServicesImpl;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/flight")
public class FlightController {

	@Autowired
	FlightServicesImpl flightServices;
	
	//http://localhost:8191/flight/flights
		//http://localhost:8090/admin/admins
		@GetMapping("/flights")
		public List<Flight> listAllFlight()
		{
			return flightServices.listAllFlight();
		}

		//http://localhost:8191/flight/flightById/11
		@GetMapping("/flightById/{id}")
		public Flight findFlightById(@PathVariable(value = "id")int flightNumber)
		{
			Flight a = null;
			a = flightServices.findFlightById(flightNumber);
			return a;
		}
		
		//http://localhost:8090/flight/addFlight
				@PostMapping("/addFlight")
				public long addFlight(@RequestBody Flight flight) {
				return flightServices.addFlight(flight);	
				}
		
}
