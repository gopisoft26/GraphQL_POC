package com.user.app.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.user.app.model.Address;

public interface AddressRepository extends MongoRepository<Address, String> {

	List<Address> findByState(String state);

}
