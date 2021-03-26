package com.codecool;

public class Triangle extends Shape{
    int base;
    int baseHeight;

    public Triangle(int base, int baseHeight){
        super(base * baseHeight / 2);
        this.base = base;
        this.baseHeight = baseHeight;
    }

    @Override
    public String speak() {
        return "I'm a triangle";
    }
}
