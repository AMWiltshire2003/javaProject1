package com.company;

import java.util.Scanner;

public class Main {

    //Method to categorize speed
    public static void checkSpeed(int speed) {
        if (speed < 10) {
            System.out.println("Fast");
        } else if (speed < 20) {
            System.out.println("Faster");
        } else {
            System.out.println("Fastest");
        }
    }

    // Method to print numbers using a for loop
    public static void printNumbersUsingForLoop(int limit) {
        System.out.println("Numbers using for loop:");
        for (int i = 1; i <= limit; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    //Method to print numbers using a while loop
    public static void printNumbersUsingWhileLoop(int start) {
        System.out.println("Numbers using while loop:");
        while (start > 0) {
            System.out.println(start + " ");
            start--;
        }
        System.out.println();
    }


    // Method to perform arithmetic calculations
    public static void performArithmeticCalculations() {
        int x = 15;
        double y = (10 * 10);
        int z = (int) (x + y);
        System.out.println("Arithmetic Result (x + y): " + z);
    }

    // Method to display variable information
    public static void displayVariables() {
        int b = 125;
        float ab = 45.6f;
        boolean tryout = true;
        char symbol = '#';

        System.out.println("Integer value: " + b);
        System.out.println("Float value: " + ab);
        System.out.println("Boolean value: " + tryout);
        System.out.println("Char value: " + symbol);

        if (b < 125) {
            System.out.println("Correct");
        } else {
            System.out.println("Incorrect");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Speed check
        System.out.print("Enter speed to check: ");
        int speed = scanner.nextInt();
        checkSpeed(speed);

        // Print numbers using loops
        printNumbersUsingForLoop(10);
        printNumbersUsingWhileLoop(10);

        // Display variables and arithmetic calculations
        displayVariables();
        performArithmeticCalculations();

        // Extended functionality: User input for arithmetic operations
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.println("Addition: " + (num1 + num2));
        System.out.println("Subtraction: " + (num1 - num2));
        System.out.println("Multiplication: " + (num1 * num2));
        System.out.println("Division: " + (num1 / (double) num2));

        System.out.println("Program completed.");

        scanner.close();

    }
}
