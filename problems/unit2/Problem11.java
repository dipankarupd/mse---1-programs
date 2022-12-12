package com.raj.problems.unit2;


/*
. Define an abstract class F1 with two data members X and Y and member function
compute(). Define a class R1 that extends F1 and overrides the compute() function
to return X+Y. Class T2 extends F1 and override the compute() function to return
(X*Y)/2. Write a main method that uses run time polymorphism to call the
overridden methods.
 */

abstract  class F1 {
    
    // instance variables: 
    int x; 
    int y;
    
    F1(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    // methods: 
    abstract int compute();
}

// child class:
class R1 extends F1 {

    R1(int x, int y) {
        super(x,y);
    }

    // overriding the parent class
    @Override
    int compute() {
        return x + y;
    }
}

class T1 extends F1 {

    T1(int x, int y) {
        super(x,y);
    }

    @Override
    int compute() {
        return (x*y)/2;
    }
}
public class Problem11 {

    public static void main(String[] args) {

        F1 obj = new R1(10,20);
        System.out.println(obj.compute());

        obj = new T1(2,4);
        System.out.println(obj.compute());
    }
}
