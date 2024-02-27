package com.user.app.query.resolver;

import java.util.List;
import org.springframework.stereotype.Component;

import com.user.app.model.dealers.Dealer;
import com.user.app.repository.DealerRepository;
import graphql.kickstart.tools.GraphQLQueryResolver;

@Component
public class DealerQueryResolver implements GraphQLQueryResolver {
	private final DealerRepository dealerRepository;

	public DealerQueryResolver(DealerRepository userRepository) {
		this.dealerRepository = userRepository;
	}

	public Dealer findbyDealerId(String dealerId) {
		List<Dealer> dealer = dealerRepository.dealerId(dealerId);
		if (dealer.size() > 0) {
			return dealer.get(0);
		}
		return null;
	}

	
	public List<Dealer> findbyBrandsLanCountry(String brand, String lang, String country) {
		return dealerRepository.findByBrandsCountryAndLanguage(brand, lang, country);
	}

	public List<Dealer> findbyBrandsLanCountryDealerId(String brand, String lang, String country, String dealerId) {
		return dealerRepository.findByBrandsLanguageCountryAndDealerId(brand, lang, country, dealerId);
	}

	public List<Dealer> findbyBrandsCountry(String brand, String country) {
		return dealerRepository.findByBrandsCountry(brand, country);
	}

	public List<Dealer> findAllDealers() {
		return dealerRepository.findAll();
	}

}
