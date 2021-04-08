package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

	@GetMapping("/customer")
	public String getAllCustomers() {
		// go to db-postgres and fetch data
		return "[{ 'id' : 1, 'name' : 'david' }, { 'id': 2, 'name' : 'Sam' }]";
		
	}
	
}