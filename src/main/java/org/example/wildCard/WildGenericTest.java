package org.example.wildCard;


//! the ? (question mark) symbol represents the wildcard element
// - it means any type
// - <? extends Numbers> => any child class of Number (Integer, Float, Double)
// we can call the method of Numbers clas though any child class object


/*
  - uses:
      - type of parameter.
      - filed
      - return type
      - local variable
      - however
   - not using:
      - type of argument for a generic method invocation
      - generic class instance creation
      - supertype
*/

import java.util.ArrayList;
import java.util.List;

abstract class Shape {
    abstract void draw ();
}

class Rectangle extends Shape {
    @Override
    void draw () {
        System.out.println("drawing rectangle");
    }
}

class Circle extends Shape {
    @Override
    void draw () {
        System.out.println("drawing Circle");
    }
}

public class WildGenericTest {
    // generic method that accepts a list of any type that extends Shape
    public static void drawShapes (List<? extends Shape> lists) {
        // loop through each shape
        for (Shape s : lists) {
            s.draw();
        }
    }

    public static void main (String[] args) {
        // create a list of Rectangle
        List<Rectangle> rectangleList = new ArrayList<Rectangle>();
        rectangleList.add(new Rectangle());
        rectangleList.add(new Rectangle());

        // create a list of Circle objects
        List<Circle> circleList = new ArrayList<Circle>();
        circleList.add(new Circle());
        circleList.add(new Circle());
        circleList.add(new Circle());


        // creat list of shape
        List<Shape> shapeList = new ArrayList<Shape>();
        shapeList.add(new Circle());
        shapeList.add(new Rectangle());
        shapeList.add(new Circle());
        shapeList.add(new Rectangle());


        System.out.println("======= test with rectangle list ===========");
        drawShapes(rectangleList);
        System.out.println("======= test with Circle list ===========");
        drawShapes(circleList);
        System.out.println("======= test with shape list list ===========");
        drawShapes(shapeList);

    }
}
