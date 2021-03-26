package com.codecool;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

public class ShapeList {
    List<Shape> shapeList = new ArrayList<>();

    public void add(Shape shape){
        this.shapeList.add(shape);
    }

    public Shape getLargest(){
        Shape shapeToReturn = this.shapeList.stream().max(Comparator.comparing(Shape::getArea)).orElse(null);
        return shapeToReturn;
    }

    public String compareArea(Shape shapeOne, Shape shapeTwo){
        int areaOne = shapeOne.getArea();
        int areaTwo = shapeTwo.getArea();
        if(areaOne == areaTwo){
            return "Equal areas";
        }else if(areaOne > areaTwo){
            return shapeOne.speak();
        }else{
            return  shapeTwo.speak();
        }
    }
}
