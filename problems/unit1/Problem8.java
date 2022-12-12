package com.raj.problems.unit1;

import java.util.ArrayList;

/*
Write a Java program to define an Employee class including fields such as
empname,empid, age, occupation and Income. Overload constructors to assign
values to members of the object. Include display method to print the
employee details. In the main method create an array of employees and print
those employee details with income greater than 15k.
 */
class Employee {
    String name;
    int empid;
    int age;
    String occupation;
    float income;

    // constructors:
    Employee(String name) {
        this.name = name;
        empid = 1;
        age = 20;
        occupation = "coder";
        income = 75000;
    }

    Employee(String name, int empid, int age) {
        this.name = name;
        this.empid = empid;
        this.age = age;
        this.occupation = "Lawyer";
        this.income = 50000;
    }

    Employee(String name, int empid, int age, String occupation, float income) {
        this.name = name;
        this.empid = empid;
        this.age = age;
        this.occupation = occupation;
        this.income = income;

    }

    void display() {
        System.out.println("-------------------------------------------------------");
        System.out.println("Name: " + name);
        System.out.println("ID: " + empid);
        System.out.println("age: " + age);
        System.out.println("Occupation: " + occupation);
        System.out.println("Income: " + income);
        System.out.println("-------------------------------------------------------");
    }
}

public class Problem8 {
    public static void main(String[] args) {

        Employee[] arr = new Employee[3];

        arr[0] = new Employee("Harry");
        arr[1] = new Employee("Tom",123,25);
        arr[2] = new Employee("Jack",678,45,"teacher",10000);

        arr[0].display();
        arr[1].display();
        arr[2].display();

        // creating the list of employees with the salary less than 15000

        ArrayList<Employee> list = new ArrayList<Employee>();
        for(Employee x : arr) {
            if(x.income < 15000) {
                list.add(x);
            }
        }
        System.out.println("The detail of the ones with less salary: ");
        int n = list.size();    // size of the elements in the list:

        Employee[] result = list.toArray(new Employee[n]);  // declaring an array

        for(Employee x : result) {
            x.display();
        }
    }


}
