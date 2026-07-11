package com.zipcodewilmington.scientificcalculator;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */
public class Console {

    // Prints the given output without a newline character
    public static void print(String output, Object... args) {
        System.out.printf(output, args);
    }

    // Prints the given output followed by a newline character
    public static void println(String output, Object... args) {
        print(output + "\n", args);
    }

    // Gets a string input from the user
    public static String getStringInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        String userInput = scanner.nextLine();
        return userInput;
    }

    // Gets an integer input from the user
    // TODO: implement using scanner + Integer.parseInt (handle NumberFormatException)
    public static Integer getIntegerInput(String prompt) {
        return null;
    }

    // Gets a double input from the user
    public static Double getDoubleInput(String prompt) {
        // return null;
        Scanner scanner = new Scanner(System.in); //this initalize input from the user. 
        println(prompt); //this prints the prompt to the console 

        try {
        Double userInput = scanner.nextDouble(); //this gets the user's input as a double
        scanner.nextLine(); // consume the newline character
        return userInput;
        } catch (InputMismatchException e) {
            scanner.nextLine();
            println("Invalid input. Please enter a valid number.");
            return getDoubleInput(prompt);
        }
        
    }

    // //Calculations: Can't use this anymore because it's stateless :( back to the drawing board - Jaiden)
    // public static Double getCalc(Double num1, Double num2) {
    //     double result = 0;
    //     int operation = 0;

    //     switch (operation) {
    //         case 1:
    //             //addition
    //             result = num1 + num2;
    //             break;
    //         case 2:
    //             //subtraction
    //             result = num1 - num2;
    //             break;
    //         case 3:
    //             //multiplication
    //             result = num1 * num2;
    //             break;
    //         case 4:
    //             //division
    //             result = num1 / num2;
    //             break;
    //         default:
    //             System.out.println("Invalid operation");
    //     }

    //     return result;
    // }

    
}
