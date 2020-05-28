package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class CollectionTestSuite {

    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }

    @After
    public void after(){
        System.out.println("Test Case: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        ArrayList<Integer> emptyArrayList = new ArrayList<>();
        //When
        List<Integer> resultList = exterminator.exterminate(emptyArrayList);
        //Then
        Assert.assertEquals(0, resultList.size());
    }

    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        ArrayList<Integer> normalArrayList = new ArrayList<>();
        normalArrayList.add(1);
        normalArrayList.add(2);
        normalArrayList.add(3);
        normalArrayList.add(4);
        normalArrayList.add(5);
        normalArrayList.add(6);

        //When
        List<Integer> resultList = exterminator.exterminate(normalArrayList);
        //Then
        ArrayList<Integer> oddArrayExtract = new ArrayList<>();
        oddArrayExtract.add(2);
        oddArrayExtract.add(4);
        oddArrayExtract.add(6);
        Assert.assertEquals(oddArrayExtract, resultList);
        Assert.assertEquals(6, normalArrayList.size());
    }

}


