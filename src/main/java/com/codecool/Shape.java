package com.codecool;

public abstract class Shape {
    int area;

    public Shape(int area){
        this.area = area;
    }
    public int getArea(){
        return this.area;
    }

    abstract String speak();

}
