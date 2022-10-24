package com.example.chapter26;

import java.util.Scanner;

public class Exceptions {
    
    public static void main(String[] args) {
        String input;

        double quotient = 0;
        int numerator = 0;
        int denominator = 0;

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Please enter the numerator: ");
        try {
            input = myScanner.nextLine();
            numerator = Integer.parseInt(input);
        } catch (NumberFormatException ex) {
            System.out.println("You didn't enter a number for numerator!");
        }

        System.out.println("Please enter the denominator: ");
        try {
            input = myScanner.nextLine();
            denominator = Integer.parseInt(input);
        } catch (NumberFormatException ex) {
            System.out.println("You didn't enter a number for denominator!");
        }

        try {
            quotient = numerator / denominator;
        } catch (ArithmeticException ex) {
            System.out.println("Something went wrong: " + ex);
        }

        System.out.println("The quotient is: " + quotient);

        myScanner.close();
    }
}
