package com.bvega.java.oop.models;

public class Triangle extends Figure{

    private Double side;
    private Double base;

    public Triangle(Double side, Double base) {
        this.side = side;
        this.base = base;
    }

    @Override
    public Double calcPerimeter() {
        return this.side+this.side+this.side;
    }

    @Override
    public Double calcArea() {
        return (this.side*this.base)/2;
    }

    public Double getSide() {
        return side;
    }

    public void setSide(Double side) {
        this.side = side;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }
}
