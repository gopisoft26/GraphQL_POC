package com.user.app.query.resolver;

import java.util.List;

import org.springframework.stereotype.Component;

import com.user.app.model.Address;
import com.user.app.repository.AddressRepository;

import graphql.kickstart.tools.GraphQLQueryResolver;

@Component
public class AddressQueryResolver implements GraphQLQueryResolver {

	private final AddressRepository addressRepository;

	public AddressQueryResolver(AddressRepository addressRepository) {
		this.addressRepository = addressRepository;
	}

	public List<Address> getAllAddress() {
		return addressRepository.findAll();
	}
	
	public List<Address> findByState(String state) {
		return addressRepository.findByState(state);
	}

}
