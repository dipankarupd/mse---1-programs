package com.raj.problems.unit1;

import java.util.*;
public class BinarySearch {
    public static void main(String[] args) {

        int[] arr = new int[5];
        Scanner scn = new Scanner(System.in);

        for(int i = 0; i < arr.length; i++) {
            System.out.println("Enter element " + (i+1));
            arr[i] = scn.nextInt();
        }

        System.out.println("Enter the target element: ");
        int target = scn.nextInt();


       int result =  binarySearch(arr,target);
        System.out.println("Element found at the index :" + result);
    }

    static int binarySearch(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        int result = 0;

        while(start < end) {

            int mid = start + (end - start)/2;

            if(target < arr[mid]) {
                end = mid - 1;
            } else if(target > arr[mid]){
                start = mid  + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
