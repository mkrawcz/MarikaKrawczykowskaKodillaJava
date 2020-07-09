package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage() {
        //GIVEN
        int[] array = {1, 2, 3, 4, 5};

        //WHEN
        double result = ArrayOperations.getAverage(array);

        //THEN
        Assert.assertEquals(3, result, 0.001);
    }

    @Test
    public void testGetAverage2() {
        //GIVEN
        int[] array2 = {25, 30 ,15, 90, 75};

        //WHEN
        double result2 = ArrayOperations.getAverage(array2);

        //THEN
        Assert.assertEquals(47, result2, 0);

    }

    @Test
    public void testGetAverage0() {
        //GIVEN
        int[] array3 = {};

        //WHEN
        double result3 = ArrayOperations.getAverage(array3);

        //THEN
        Assert.assertEquals(0, result3, 0.001);
    }

    //test analogiczny jak wyżej z innymi warościami w tablicy

    //opcjonalnie: test dla pustej tablicy

}