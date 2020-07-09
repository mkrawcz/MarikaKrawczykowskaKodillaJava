package com.kodilla.stream.world;

import java.util.*;

public final class Continent {

    private final String continentName;
    private final Set<Country> countries = new HashSet<>();

    public Continent(final String continentName) {
        this.continentName = continentName;
    }

    public String getContinentName() {
        return continentName;
    }

    public void addCountry(Country country) {
        countries.add(country);
    }

    public List<Country> getCountries(){
        return new ArrayList<>(countries);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Continent continent = (Continent) o;
        return Objects.equals(continentName, continent.continentName) &&
                Objects.equals(countries, continent.countries);
    }

    @Override
    public int hashCode() {
        return Objects.hash(continentName, countries);
    }

    @Override
    public String toString() {
        return "Continent{" +
                "continentName='" + continentName + '\'' +
                ", countries=" + countries +
                '}';
    }
}
