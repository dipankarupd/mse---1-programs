package com.raj.problems.unit1;

import java.util.Scanner;

class Account {
    Scanner sc = new Scanner(System.in);
    int accNo;
    String name;
    long phoneNo;
    float balAmount;

    void createAccount() {
        System.out.println("Enter the account number: ");
        accNo = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the account holder name: ");
        name = sc.nextLine();

        System.out.println("Enter the account holder phone number: ");
        phoneNo = sc.nextLong();



        balAmount = 0;
        System.out.println("Account has been created");
    }
    void deposite() {
        System.out.println("Enter the amount to be deposited ");
        float depositeAmt = sc.nextFloat();

        balAmount+= depositeAmt;

        printDetail();
    }

    void withdraw() {
        System.out.println("Enter the amount to be withdrawn ");
        float withdrawAmt = sc.nextFloat();
        balAmount -= withdrawAmt;

        printDetail();

    }
    void printDetail() {
        System.out.println("-------------------------------------------------------");
        System.out.println("Account Number: " + accNo);
        System.out.println("Name of the user: " + name);
        System.out.println("Phone number: " + phoneNo);
        System.out.println("Total balance amount: " + balAmount);
        System.out.println("--------------------------------------------------------");
    }
}

public class Program26 {

    public static void main(String[] args) {
        Account account1 = new Account();
        account1.createAccount();
        account1.printDetail();
        account1.deposite();
        account1.withdraw();
    }
}

