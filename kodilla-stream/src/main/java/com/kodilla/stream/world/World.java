package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class  World {

    private Set<Continent> continents = new HashSet<>();

    public void addContinent(Continent continent) {
        continents.add(continent);
    }

    public List<Continent> getContinents(){
        return new ArrayList<>(continents);

    }

    public BigDecimal getPeopleQuantity() {
        return continents.stream()
                .flatMap(continent -> continent.getCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }
}
