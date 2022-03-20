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

import com.example.ams.beans.Payment;
import com.example.ams.services.PaymentServiceImpl;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/tra2")
public class PaymentController {
	
	@Autowired
	PaymentServiceImpl TransactionService;
	
	// http://localhost:8191/tra2/t2
		@GetMapping("/t2")
		public List<Payment> listAllTransaction() {
			List<Payment> traList = TransactionService.listAllTransaction();
			return traList;
		}
	
		// http://localhost:8191/tra2/findId2/111
		@GetMapping("/findId2/{id}")
		public Payment findTransactionId(@PathVariable(value = "id") int Trans_id) {
			Payment a = null;
			a = TransactionService.findTransactionId(Trans_id);
			return a;
		}
		
		// http://localhost:8191/tra2/addtransaction
		@PostMapping("/addtransaction")
		public int addTransaction(@RequestBody Payment t) {
			return TransactionService.addTransaction(t);
		}
}
