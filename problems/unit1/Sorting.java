package com.raj.problems.unit1;

/*                                     Program 18
Write a Java program to Java Program to sort an anonymous int array.
 */

public class Sorting {
    public static void main(String[] args) {

        sort(new int[] {6,3,7,9,1,18,45,21});
    }

    static void sort(int[] arr) {

        for(int i = 0; i< arr.length - 1; i++) {
            for(int j = 0; j < arr.length - 1 - i; j++) {

                if(arr[j] > arr[j+1]) {
                    swap(arr,j,j+1);
                }
            }
        }

        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void swap(int[] arr, int j, int i) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
