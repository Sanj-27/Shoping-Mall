package com.dsatm.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dsatm.entity.CustomerEntity;

public interface CustomerRepository extends JpaRepository<CustomerEntity,Integer> {

}
