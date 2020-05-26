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
        ArrayList<Integer> emptyArrayList = new ArrayList<>();
        ArrayList<Integer> normalArrayList = new ArrayList<>();
        System.out.println("Empty ArrayList size: " + emptyArrayList.size());
        //When
        OddNumbersExterminator completedList = new OddNumbersExterminator(emptyArrayList);
        completedList.exterminate(emptyArrayList);
        System.out.println("Empty ArrayList size: " + emptyArrayList.size());
        //Then
        Assert.assertEquals(normalArrayList, emptyArrayList);
    }

    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        ArrayList<Integer> normalArrayList = new ArrayList<>();
        normalArrayList.add(1);
        normalArrayList.add(2);
        normalArrayList.add(3);
        normalArrayList.add(4);
        normalArrayList.add(5);
        normalArrayList.add(6);

        ArrayList<Integer> oddArrayExtract = new ArrayList<>();
        oddArrayExtract.add(2);
        oddArrayExtract.add(4);
        oddArrayExtract.add(6);
        //When
        OddNumbersExterminator completedList1 = new OddNumbersExterminator(normalArrayList);
        completedList1.exterminate(normalArrayList);
        //Then
        Assert.assertEquals(oddArrayExtract, normalArrayList);
    }

}


