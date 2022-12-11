package com.raj.problems.unit1;

/*
Write a Java program to Java Program to sort an anonymous int array.
 */

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {

        sort(new int[] {6,3,7,9,1,18,45,21});
    }

    static void sort(int[] arr) {
        Arrays.sort(arr);

        System.out.print("[");
        for(int i: arr) {
            System.out.print(i + " ");
        }
        System.out.print("]");
    }
}
