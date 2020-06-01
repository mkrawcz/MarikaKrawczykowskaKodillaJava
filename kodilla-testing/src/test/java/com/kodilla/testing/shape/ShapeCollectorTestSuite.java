package com.kodilla.testing.shape;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @Before
    public void Before() {
        System.out.println("Start testu nr: " + testCounter);
    }

    @After
    public void After() {
        System.out.println("Koniec testu nr: " + testCounter);
        testCounter++;
    }

    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Triangle triangle = new Triangle(5.4,5.6,7.8);
        //When
        shapeCollector.addFigure(triangle);
        //Then
        Assert.assertEquals(1, shapeCollector.shapesListSize());
    }

    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Triangle triangle = new Triangle(5.4,5.6,7.8);
        shapeCollector.addFigure(triangle);
        //When
        boolean result = shapeCollector.removeFigure(triangle);
        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0, shapeCollector.shapesListSize());

    }

    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Triangle triangle = new Triangle(5.4,5.6,7.8);
        shapeCollector.addFigure(triangle);
        //When
        Shape retrievedShape = shapeCollector.getFigure(0);
        //Then
        Assert.assertEquals(triangle, retrievedShape);
    }

    @Test
    public void testRemoveFigureNotExisting() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle(2.0);
        //When
        boolean result = shapeCollector.removeFigure(circle);
        //Then
        Assert.assertFalse(result);

    }

}
