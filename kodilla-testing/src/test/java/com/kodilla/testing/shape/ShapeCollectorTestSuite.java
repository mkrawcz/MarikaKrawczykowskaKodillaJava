package com.kodilla.testing.shape;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class ShapeCollectorTestSuite {

    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Shape("Circle",  2);
        //When
        shapeCollector.addFigure(shape);
        //Then
        Assert.assertEquals(1, shapes.size());
    }

    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Shape("Circle",  2);
        //When
        shapeCollector.removeFigure(shape);
        //Then
        Assert.assertEquals(0, shapes.size());

    }

    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        ArrayList<Shape> shapes = new ArrayList<>();
    }





}
