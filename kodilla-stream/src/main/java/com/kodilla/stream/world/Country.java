package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {
    private final String countryName;
    private final BigDecimal countryPeopleQuantity;
    private final String nameOfContinent;

    public Country(String countryName, BigDecimal countryPeopleQuantity, String nameOfContinent) {
        this.countryName = countryName;
        this.countryPeopleQuantity = countryPeopleQuantity;
        this.nameOfContinent = nameOfContinent;
    }

    public BigDecimal getCountryPeopleQuantity() {
        return countryPeopleQuantity;
    }
}
