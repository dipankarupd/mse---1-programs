package com.raj.problems.unit2;

/*
Define a shapes class with an instance variable dim and a method area(). There is
no specific dim w.r.t. a Shapes object. Extend Shapes lass into 2 other classes,
Circle and Square classes. Override area() method in Circle and Square classes to
find area of Circle and Square objects respectively. Use dynamic method dispatch
concept(run-time polymorphism )to invoke area() method of all the 3 classes.
 */

abstract class Shape {

    int dim;

    abstract double area();

}

class Circle extends Shape {

    @Override
    double area() {
        return 3.14*dim*dim;
    }
}

class Square extends Shape {

    @Override
    double area() {
        return dim * dim;
    }
}

// driver class:
public class Problem13 {

    public static void main(String[] args) {

        Shape shape = new Circle();
        shape.dim = 7;
        System.out.println("Area of circle is: " + shape.area());

        Shape square = new Square();
        square.dim = 4;
        System.out.println("Area of the square is: " + square.area());
    }
}
