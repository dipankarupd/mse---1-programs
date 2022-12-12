package com.raj.problems.unit1;

import java.util.Arrays;

/*
                                     Problem 24
Write a Java program to sort strings that are passed as varargs to a method.
 */

public class StringVarArgSort {

    public static void main(String[] args) {
        fun("Hello", "World");

        fun("Bikash", "Dipankar", "Ayush", "Aayush");

    }

    static void fun(String ... arr)  {
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
