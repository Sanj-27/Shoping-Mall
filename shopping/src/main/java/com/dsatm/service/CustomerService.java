package com.dsatm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dsatm.entity.CustomerEntity;
import com.dsatm.repo.CustomerRepository;
@Service
public class CustomerService {

	@Autowired
	 private CustomerRepository repo;

	 public List<CustomerEntity> listAll()
	 {
	 return repo.findAll();
	 }

	 public void save(CustomerEntity customer)
	 {
	 repo.save(customer);
	 }

	 public CustomerEntity get(Integer id)
	 {
	 return repo.findById(id).get();
	 }

	 public void delete(Integer id)
	 {
	 repo.deleteById(id);
	 }

}
