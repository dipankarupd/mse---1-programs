package com.raj.problems.unit2;

/*
Declare a Calculate class that assigns values to two integer numbers. Define
classes AddC and SubC that inherits Calculate class and includes methods to add
and subtract two numbers. Include Display() functions in both the super class and
the sub classes and show the concept of dynamic method overriding
 */

// parent class: 
class Calculate {
    int num1;
    int num2;
    
    Calculate(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    
    void display() {
        System.out.println("In the super class method");
    }
}

// child class: 
class AddC extends Calculate {
    
    AddC(int num1, int num2) {
        super(num1, num2);
    }
    // overriding the method
    void display() {
        System.out.println("Sum is: " + (num1 + num2));
    }
}
// child class: 
class SubC extends Calculate {
    SubC(int num1, int num2) {
        super(num1, num2);
    }
    // overriding the method
    void display() {
        System.out.println("Difference is: " +(num1 - num2));
    }
}

public class Problem4 {
    public static void main(String[] args) {
        
        Calculate c1 = new Calculate(2,3);
        c1.display();  // calls the method of parent class

        c1 = new AddC(2,3);
        c1.display();   // calls the method of child class AddC

        c1 = new SubC(4,1);
        c1.display();   //calls the method of child class SubC

    }
}
