package com.user.app.query.mutation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.user.app.model.dealers.Dealer;
import com.user.app.repository.DealerRepository;

import graphql.kickstart.tools.GraphQLMutationResolver;

@Component
public class DealerMutation implements GraphQLMutationResolver {

	@Autowired
	private DealerRepository dealerRepository;

	public Dealer save(String owner) {
		return null;
	}
}
