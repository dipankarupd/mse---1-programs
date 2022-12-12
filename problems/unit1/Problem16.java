package com.raj.problems.unit1;

import java.util.Scanner;

/*
Design a student class with 2 instance variables Usn and name, a constructor
and a method to print student object. Write driver class to test an array of
student class of size N
 */
class Student1 {
    String name;
    String usn;

    Student1(String name, String usn) {
       this.name = name;
       this.usn = usn;
    }

    void print() {
        System.out.println("Name: " + name);
        System.out.println("USN: " + usn);
    }
}
public class Problem16 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n;
        System.out.println("Enter the number of elements: ");
        n = scn.nextInt();
        scn.nextLine();

        Student1[] arr = new Student1[n];
        for(int i=0; i<n; i++) {
            arr[i] = new Student1(scn.nextLine(),scn.nextLine());
        }
        for(int i=0; i<n; i++) {
           arr[i].print();
        }
    }
}