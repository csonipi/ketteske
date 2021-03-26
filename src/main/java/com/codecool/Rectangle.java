package com.codecool;

public class Rectangle extends Shape{
    int sideA;
    int sideB;

    public Rectangle(int sideA, int sideB){
        super(sideA * sideB);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public String speak() {
        return "I'm a rectangle";
    }
}
