package com.raj.problems.unit1;

/*
Develop a program to swap 2 objects of a Number class.
Number class has an instance variable of type double, a constructor
to initialize and the swap method.
 */
public class Number {

    double num1;
    double num2;

    Number(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    void swap() {
        System.out.println("Before swap: " + num1 + " " + num2);
        double temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After swap: " + num1 + " " + num2);

    }
}

class NumberClass {
    public static void main(String[] args) {
        Number n1 = new Number(5,10);
        n1.swap();
    }
}
