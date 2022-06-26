package com.bvega.java.oop.models;

public class Circle extends Figure{

    private Double radio;

    public Circle(Double radio) {
        this.radio = radio;
    }

    @Override
    public Double calcPerimeter() {
        return 2 * Math.PI * this.radio;
    }

    @Override
    public Double calcArea() {
        return Math.PI * Math.pow(this.radio,2);
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }
}
