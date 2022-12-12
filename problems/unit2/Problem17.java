package com.raj.problems.unit2;

/*
.Define an interface Figure with method Area() and Display(). Define Rectangle,
Triangle and Circle class that implements Figure interface. Using the above classes
create object and compute the areas
 */

interface Figure {
    int area();
    void display();
}

class Rectangle implements Figure {

    int length = 5;
    int width = 4;

    @Override
    public int area() {
        return length * width;
    }

    @Override
    public void display() {
        System.out.println("The area is: " + this.area());
    }
}

class Triangle implements Figure {

    int base = 5;
    int height = 4;
    @Override
    public int area() {
        return base * height / 2;
    }

    @Override
    public void display() {
        System.out.println("The area of the triangle is: " + this.area());
    }
}

class CirclE implements Figure {

    int radius = 7;
    @Override
    public int area() {
        return (int) (3.17 * radius * radius);
    }

    @Override
    public void display() {
        System.out.println("The area of Circle is: " + this.area());
    }
}
public class Problem17 {
    public static void main(String[] args) {


        Rectangle r1 = new Rectangle();
        r1.display();

        Triangle t1 = new Triangle();
        t1.display();

        CirclE c1 = new CirclE();
        c1.display();
    }
}
