package com.kodilla.stream.world;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity(){
        //GIVEN
        World world = new World();

        Continent southAmerica = new Continent("South America");
        Continent europe = new Continent("Europe");
        Continent northAmerica = new Continent("North America");
        Continent asia = new Continent("Asia");

        world.addContinent(southAmerica);
        world.addContinent(europe);
        world.addContinent(northAmerica);
        world.addContinent(asia);

        southAmerica.addCountry(new Country("Brazil", new BigDecimal("212393000")));
        southAmerica.addCountry(new Country("Argentina", new BigDecimal("45102000")));
        southAmerica.addCountry(new Country("Colombia", new BigDecimal("48549000")));
        europe.addCountry(new Country("Poland", new BigDecimal("38426000")));
        europe.addCountry(new Country("Germany", new BigDecimal("81459000")));
        europe.addCountry(new Country("Italy", new BigDecimal("603977339")));
        northAmerica.addCountry(new Country("USA", new BigDecimal("321234000")));
        northAmerica.addCountry(new Country("Mexico", new BigDecimal("121006000")));
        northAmerica.addCountry(new Country("Canada", new BigDecimal("35819000")));
        asia.addCountry(new Country("China", new BigDecimal("1387160730")));
        asia.addCountry(new Country("India", new BigDecimal("1324009090")));
        asia.addCountry(new Country("Indonesia", new BigDecimal("255462000")));

        //WHEN
        BigDecimal worldPeopleQuantity = world.getPeopleQuantity();

        //THEN
        assertEquals(new BigDecimal("4474597159"), worldPeopleQuantity);
    }

}