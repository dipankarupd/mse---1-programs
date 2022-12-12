package com.raj.problems.unit1;
import java.util.Scanner;
/*
Design a person class with instance variables name and age and a constructor to
initialize, a compare method to compare 2 person objects and return person object
with greater age. Write driver class to find eldest person among N person objects
 */

// declaring a class
class Person {

    // instance variables:
    String name;
    int age;

    // constructor:
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Person compare(Person p1, Person p2) {

        if(p1.age > p2.age) {
            return p1;
        } else {
            return p2;
        }
    }

}
public class Problem17 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n;
        System.out.println("Enter the number of objects to be created: ");
        n = scn.nextInt();

        // creating a person array to store n objects:
        Person[] arr = new Person[n];

        System.out.println("Enter the n person objects details");

        for(int i = 0; i< arr.length; i++) {
            arr[i] = new Person(scn.next(),scn.nextInt());
        }
        Person eldest = arr[0];

        // to compare the age of the two persons:
        for (int i = 0; i<n-1; i++) {
           eldest = arr[i].compare(arr[i], arr[i+1]);
        }

        System.out.println("The eldest person detail: ");
        System.out.print("Name: " + eldest.name + " age: " + eldest.age);
    }
}
