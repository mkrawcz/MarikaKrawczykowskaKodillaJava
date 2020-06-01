package com.kodilla.testing.shape;

public class Triangle implements Shape {

    private Double a;
    private Double b;
    private Double c;

    public Triangle(Double a, Double b, Double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String getShapeName() {
        return "Triangle";
    }

    @Override
    public Double getField() {
        return null;
    }

    public Double getField(Double a, Double b, Double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    //public Double getField() {
    //    return 0.5 * sideA * heightH;
    //}
}
