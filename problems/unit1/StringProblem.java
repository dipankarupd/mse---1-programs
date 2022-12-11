package com.raj.problems.unit1;
import java.util.*;

public class StringProblem {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter first string: ");
        String str1 = scn.next();

        System.out.println("Enter second string: ");
        String str2 = scn.next();

        String result = str1 + str2;
        System.out.println("The concanitated string is: " + result);

        String reversedResult = reverse(result);
        System.out.println("The reversed string is: " + reversedResult);
    }

    static String reverse(String str) {
        String ans = "";
        for(int i=0; i<str.length(); i++) {
            ans = ans + str.charAt(str.length()-1-i);
        }
        return ans;
    }
}
