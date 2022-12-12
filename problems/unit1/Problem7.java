package com.raj.problems.unit1;

/*

Write a Java program by using class with the following specifications:
Class name- Book
Data members or Instance variables-
String: title, author, Publisher Double: Cost.
Member methods:
i. void input ()- Accepts the title, author name, Publisher name and Cost of the book.
ii. void display ()- display the title, author name, Publisher name and Cost of the
book.
 */

import java.util.*;

class Books {

    Scanner scn = new Scanner(System.in);
    String title;
    String author;
    String publisher;
    double cost;

    void input() {
        System.out.println("Enter the title of the book: ");
        title = scn.nextLine();

        System.out.println("Enter the name of the author: ");
        author = scn.nextLine();

        System.out.println("Enter the publication of the book: ");
        publisher = scn.nextLine();

        System.out.println("Ente the cost: ");
        cost = scn.nextDouble();
    }

    void display() {

        System.out.println("The title is: " + title);
        System.out.println("The author is: " + author);
        System.out.println("The publisher is: " + publisher);
        System.out.println("The cost of the book is: " + cost);

    }
}

public class Problem7 {
    public static void main(String[] args) {

        Books b1 = new Books();
        b1.input();
        b1.display();
    }
}
