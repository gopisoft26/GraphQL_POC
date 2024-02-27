# GraphQL_POC
GraphQL_POC

## find all Dealers

query {
  findAllDealers {
    dealerId
    owner
    country
    language
  }
}


## find by brand country and lang

query {
  findbyBrandsLanCountry(owner:"nissan",lang:"es",country:"co") {
    dealerId
    name
  }
}


## find specific dealers

{
  findbyDealerId(dealerId:"COLID01") {
    dealerId
    country
    language
    address {
      addressLine1
      addressLine2
      state
    }
  }
}

## find by brand country

query {
  findbyBrandsCountry(owner: "nissan",country: "co") {
    dealerId
    country
  }
}

## https://api-use-tls.prod.heliosnissan.net/helios-api-dealers/dealerInformation/nissan/us/en/dealers/NNA5251
query {
  findbyBrandsLanCountryDealerId(owner:"nissan",lang:"es",country:"co",dealerId:"NNA5251") {
    dealerId
    name
  }
}