package com.user.app.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.user.app.model.dealers.Dealer;

public interface DealerRepository extends MongoRepository<Dealer, String> {

	List<Dealer> dealerId(String dealerId);

	@Query("{owner : ?0, language : ?1, country : ?2}")
	List<Dealer> findByBrandsCountryAndLanguage(String brand, String lang, String country);

	@Query("{owner : ?0, language : ?1,country : ?2,dealerId : ?3}")
	List<Dealer> findByBrandsLanguageCountryAndDealerId(String brand, String lang, String country, String dealerId);

	@Query("{owner : ?0,country : ?1}")
	List<Dealer> findByBrandsCountry(String brand, String country);

}
