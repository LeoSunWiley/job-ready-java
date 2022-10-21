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
        input = myScanner.nextLine();
        numerator = Integer.parseInt(input);

        System.out.println("Please enter the denominator: ");
        input = myScanner.nextLine();
        denominator = Integer.parseInt(input);

        quotient = (double) numerator / denominator;

        System.out.println("The quotient is: " + quotient);

        myScanner.close();
    }
}
