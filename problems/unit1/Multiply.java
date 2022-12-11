package com.raj.problems.unit1;

/*
Write a Java program to multiply 2 integers using a recursive function.
Input integers from the console.
 */

public class Multiply {

    int multiply(int a, int b){

        if(a == 0 || b == 0) {
            return 0;
        }
        return a + multiply(a,b-1);
    }

    public static void main(String[] args) {

        Multiply m1 = new Multiply();
        System.out.println(m1.multiply(7,4));
    }
}
