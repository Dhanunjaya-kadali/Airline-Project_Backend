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

import com.example.ams.beans.SeatSelect;
import com.example.ams.services.SeatSelectServices;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/seat")
public class SeatSelectController {

	@Autowired
	SeatSelectServices seatSelectService;
	
	@Autowired
	
	//http://localhost:8090/seat/listofseats
	@GetMapping("/listofseats")
	public List<SeatSelect> listAllSeatSelect()
	{
		return seatSelectService.listAllSeatSelect();
	}
	
	//http://localhost:8090/seat/seatById/11
		@GetMapping("/seatById/{id}")
		public SeatSelect findAdminById(@PathVariable(value = "id")long seatNumber)
		{
			SeatSelect a = null;
			a = seatSelectService.findSeatById(seatNumber);
			return a;
		}
		
		//http://localhost:8090/seat/addSeatSelect
				@PostMapping("/addSeatSelect")
				public long addSeatSelect(@RequestBody SeatSelect seatSelect) {
				return seatSelectService.addSeatSelect(seatSelect);	
				}
}
