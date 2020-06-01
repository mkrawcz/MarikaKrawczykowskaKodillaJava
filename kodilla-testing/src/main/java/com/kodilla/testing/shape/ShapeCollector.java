package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    private List<Shape> shapesList = new ArrayList<>();

    public boolean addFigure(Shape shape) {
        return shapesList.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        return shapesList.remove(shape);
    }

    public Shape getFigure(int n){
        Shape theFigure = null;
        if ((n >= 0) && (n <= shapesList.size())) {
            theFigure = shapesList.get(n);
        }
        return theFigure;
    }

    public ArrayList<String> showFigures() {
        ArrayList<String> showList = new ArrayList<>();
        for (Shape currentShape : shapesList) {
            String currentShowFigure = (currentShape.getShapeName() + " " + currentShape.getField());
            showList.add(currentShowFigure);
        }
        return showList;
    }

    public int shapesListSize() {
        return shapesList.size();
    }

}
