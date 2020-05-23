package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CollectionTestSuite {

    ArrayList<Integer> normalArrayList = new ArrayList<>();
    ArrayList<Integer> oddArrayExtract = new ArrayList<>();
    ArrayList<Integer> emptyArrayList = new ArrayList<>();

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
        System.out.println("Empty ArrayList size: " + emptyArrayList.size());
        System.out.println("Normal ArrayList size: " + normalArrayList.size());
        //When
        OddNumbersExterminator completedList = new OddNumbersExterminator(emptyArrayList);
        completedList.exterminate(emptyArrayList);
        System.out.println("Empty ArrayList size: " + emptyArrayList.size());
        System.out.println("Normal ArrayList size: " + normalArrayList.size());
        //Then
        Assert.assertEquals(normalArrayList, emptyArrayList);
    }

    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        Random randomNumber = new Random();
        for (int i=0; i<20; i++) {
            normalArrayList.add(randomNumber.nextInt(50));
            if (normalArrayList.get(i) % 2 == 0) {
                oddArrayExtract.add(normalArrayList.get(i));
            }
            System.out.print(normalArrayList.get(i) + " ");
        }
        System.out.println("\nList completed, ArrayList size: " + normalArrayList.size());
        //When
        OddNumbersExterminator completedList = new OddNumbersExterminator(normalArrayList);
        completedList.exterminate(normalArrayList);

        for (Object i : normalArrayList) {
            System.out.print(i.toString() + " ");
        }
        System.out.println("\nOdd numbers extermination, ArrayList size: " + completedList.size());

        for (Object i : oddArrayExtract) {
            System.out.print(i.toString() + " ");
        }
        System.out.println("\nList of even numbers, Arraylist size: " + oddArrayExtract.size());
        //Then
        Assert.assertEquals(oddArrayExtract, normalArrayList);
    }

}


