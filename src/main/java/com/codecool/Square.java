package com.codecool;

public class Square extends Rectangle{
    int side;

    public Square(int side) {
        super(side, side);
        this.side = side;
    }

    @Override
    public String speak(){
        return "I'm a square";
    }
}
