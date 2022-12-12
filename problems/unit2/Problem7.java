package com.raj.problems.unit2;

/*
Declare an employee class with instance variables empid, name and salary and
methods to input and display employee data. Extend this class in Programmer
class. Programmer class has an instance variable bonus and method to input and
display Programmer data and main() method to create and test programmer object
 */
import java.util.*;
class Employee {

    Scanner scn = new Scanner(System.in);

    int empid;
    String name;
    float salary;

    void input(){
        System.out.println("Enter the employee id: ");
        empid = scn.nextInt();
        scn.nextLine();

        System.out.println("Enter the name: ");
        name = scn.nextLine();

        System.out.println("Enter the salary: ");
        salary = scn.nextFloat();
    }

    void display() {

        System.out.println("Employee ID: " + empid);
        System.out.println("Employee name: " + name);
        System.out.println("Employee salary " + salary);

    }
}

class Programmer extends Employee {
    float bonus;

    @Override
    void input() {
        super.input();
        System.out.println("Enter the bonus");
        bonus = scn.nextFloat();
    }

    void display() {
        super.display();
        System.out.println("Bonus: " + bonus);
    }
}

public class Problem7 {
    public static void main(String[] args) {

        Programmer p1 = new Programmer();
        p1.input();
        p1.display();
    }
}
