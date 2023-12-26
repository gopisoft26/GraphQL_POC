package com.user.app.query.mutation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import com.user.app.model.Address;
import com.user.app.repository.AddressRepository;

import graphql.kickstart.tools.GraphQLMutationResolver;

@Component
public class AddressMutation implements GraphQLMutationResolver {

	@Autowired
	private AddressRepository addressRepository;

	public Address createAddress(@RequestBody Address adr) {
		Address address = new Address();
		address.setAddressLine1(adr.getAddressLine1());
		address.setAddressLine2(adr.getAddressLine2());
		address.setCity(adr.getCity());
		address.setCountry(adr.getCountry());
		address.setPinCode(adr.getPinCode());
		address.setState(adr.getState());
		addressRepository.save(address);
		return address;
	}
}
