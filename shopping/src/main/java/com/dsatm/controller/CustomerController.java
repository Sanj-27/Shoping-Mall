package com.dsatm.controller;

import java.util.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import com.dsatm.entity.CustomerEntity;
import com.dsatm.service.CustomerService;

@RestController

public class CustomerController {

	@Autowired
	 private CustomerService service;
	private CustomerEntity existCustomer;

	@GetMapping("/customer")
	
	
	 public List<CustomerEntity> list()
	 {
	 return service.listAll();
	 }
	
	@GetMapping("/customer/{id}")
	 public ResponseEntity<CustomerEntity> get(@PathVariable Integer id)
	 {
	 try
	 {
	 CustomerEntity customer = service.get(id); // 
	 return new ResponseEntity<CustomerEntity>(customer, HttpStatus.OK);
	 }
	 catch (NoSuchElementException e)
	 {
	 return new ResponseEntity<CustomerEntity>( HttpStatus.NOT_FOUND);
	 }
	 }
	 
	
	// RESTful API method for Create operation
	 @PostMapping("/customer")
	 public void add(@RequestBody CustomerEntity customer)
	 {
	 service.save(customer);
	 }

	 // RESTful API method for Update operation
	 @PutMapping("/customer/{id}")
	 public ResponseEntity<?> update(@RequestBody CustomerEntity customer, @PathVariable Integer id)
	 {
	 try
	 {
	 setExistCustomer(service.get(id));
	 service.save(customer);
	 return new ResponseEntity<>(HttpStatus.OK);
	 }
	 catch (NoSuchElementException e)
	 {
	 return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	 }
	 }
	 // RESTful API method for Delete operation
	 @DeleteMapping("/customer/{id}")
	 public void delete(@PathVariable Integer id)
	 {
	 service.delete(id);
	 }

	public CustomerEntity getExistCustomer() {
		return existCustomer;
	}

	public void setExistCustomer(CustomerEntity existCustomer) {
		this.existCustomer = existCustomer;
	}
}
