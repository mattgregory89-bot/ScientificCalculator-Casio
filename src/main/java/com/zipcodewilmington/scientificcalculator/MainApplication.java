package com.zipcodewilmington.scientificcalculator;

public class MainApplication {

    public static void main(String[] args) {

        boolean programRunning = true;

        while (programRunning) {

            displayStartMenu();

            // I recommend making the choices (y/n)
            String startChoice =
                    Console.getStringInput("Enter your choice: ")
                            .trim()
                            .toUpperCase();

            switch (startChoice) {

                case "1":
                    startCalculator();
                    break;

                case "0":
                    Console.println("Goodbye!");
                    programRunning = false;
                    break;

                default:
                    Console.println("Please enter 0 or 1.");
            }
        }
    }

    public static void displayStartMenu() {

        Console.println("");
        Console.println("====================================");
        Console.println("       SCIENTIFIC CALCULATOR");
        Console.println("====================================");
        Console.println("1. Enter Calculator");
        Console.println("0. Exit");
        Console.println("====================================");
    } //end displayStartMenu()


    public static void startCalculator() {

        boolean calculatorRunning = true;

        int currentPage = 1;

        while (calculatorRunning) {

            displayCurrentPage(currentPage);

            String choice =
                    Console.getStringInput("Enter selection: ")
                            .trim()
                            .toUpperCase();

            switch (currentPage) {

                case 1:
                    currentPage =
                    //where did handlePageOne come from?
                            handlePageOne(
                                    choice,
                                    currentPage
                            );

                    if (choice.equals("B")) {
                        calculatorRunning = false;
                    }

                    break;

                case 2:
                    currentPage =
                            handlePageTwo(
                                    choice,
                                    currentPage
                            );

                    break;

                case 3:
                    currentPage =
                            handlePageThree(
                                    choice,
                                    currentPage
                            );

                    break;

                case 4:
                    currentPage =
                            handlePageFour(
                                    choice,
                                    currentPage
                            );

                    if (choice.equals("B")) {
                        calculatorRunning = false;
                    }

                    break;

                default:
                    Console.println("Invalid page.");
                    currentPage = 1;
            }
        }

        Console.println("Returning to the start menu.");
    }

    public static void displayCurrentPage(int currentPage) {

        switch (currentPage) {

            case 1:
                displayBasicMenu();
                break;

            case 2:
                displayTrigMenu();
                break;

            case 3:
                displayInverseAndLogMenu();
                break;

            case 4:
                displayNumberSystemAndMemoryMenu();
                break;

            default:
                displayBasicMenu();
        }
    }

    public static int handlePageOne(
            String choice,
            int currentPage
    ) {

        switch (choice) {

            /* 
            where do the two numbers come from?: getDoubleInput();
            how many times do I neet to call it? Once, the c
            where does the artithmetic object get created?
            after I call .add(); how do I get the number back out to show to the user?
            */
            
            case "1":
                Console.println("Addition selected.");

                //Logic///
                double num1 = Console.getDoubleInput("Enter first number");
                double num2 = Console.getDoubleInput("Enter second number");
                Arithmetic add = new Arithmetic(num1);
                add.add(num2);
                double result = add.getResult();
                String finalResult = String.valueOf(result);
                Console.println(finalResult);
                //Logic//

                break;

            case "2":
                Console.println("Subtraction selected.");

                //Logic///
                double snum1 = Console.getDoubleInput("Enter first number");
                double snum2 = Console.getDoubleInput("Enter second number");
                Arithmetic sub = new Arithmetic(snum1);
                sub.subtract(snum2);
                double subResult = sub.getResult();
                String finalSubResult = String.valueOf(subResult);
                Console.println(finalSubResult);
                //Logic//

                break;

            case "3":
                Console.println("Multiplication selected.");

                //Logic///
                double mnum1 = Console.getDoubleInput("Enter first number");
                double mnum2 = Console.getDoubleInput("Enter second number");
                Arithmetic multiply = new Arithmetic(mnum1);
                multiply.multiply(mnum2);
                double mResult = multiply.getResult();
                String finalMultiplySubResult = String.valueOf(mResult);
                Console.println(finalMultiplySubResult);
                //Logic//

                break;

            case "4":
                Console.println("Division selected.");

                  //Logic///
                double dnum1 = Console.getDoubleInput("Enter first number");
                double dnum2 = Console.getDoubleInput("Enter second number");

                try {
                Arithmetic divide = new Arithmetic(dnum1);
                divide.divide(dnum2);
                double dResult = divide.getResult();
                String finalDivideResult = String.valueOf(dResult);
                Console.println(finalDivideResult);
                } catch (ArithmeticException e) {
                    // TODO: handle exception
                    Console.println("Invalid input. You cannot divide by 0, please try again");

                }
            
                //Logic//

                break;

            case "5":
                Console.println("Square root selected.");
                //Logic/// tehcnically redunant but it's functional. 
                double sqrtnum1 = Console.getDoubleInput("Enter first number");
                Arithmetic squareRoot = new Arithmetic(sqrtnum1);
                squareRoot.squareRoot(sqrtnum1);
                double sqrtResult = squareRoot.getResult();
                String finalSquareRootResult = String.valueOf(sqrtResult);
                Console.println(finalSquareRootResult);
                //Logic//
                break;

            case "6":
                Console.println("Power selected.");

                //Logic///
                double powernum1 = Console.getDoubleInput("Enter first number");
                double powernum2 = Console.getDoubleInput("Enter second number");
                Arithmetic power = new Arithmetic(powernum1);
                power.power(powernum2);
                double powerResult = power.getResult();
                String finalPowerResult = String.valueOf(powerResult);
                Console.println(finalPowerResult);
                //Logic//
                
                break;

            case "7":
                Console.println("Modulo selected.");

                // comment to push correctly
                double numComment;

                //Logic/
                double modnum1 = Console.getDoubleInput("Enter first number");
                double modnum2 = Console.getDoubleInput("Enter second number");
                Arithmetic modulo = new Arithmetic(modnum1);
                modulo.modulo(modnum2);
                double moduloResult = modulo.getResult();
                String finalModuloResult = String.valueOf(moduloResult);
                Console.println(finalModuloResult);
                //Logic//

                break;

            case "C":
                clearDisplay();
                break;

            case "N":
                currentPage = 2;
                break;

            case "B":
                break;

            default:
                Console.println("Invalid selection.");
        }

        return currentPage;
    }

    public static int handlePageTwo(
            String choice,
            int currentPage
    ) {

        switch (choice) {

            case "1":
                Console.println("Sine selected.");

                double sineInput = Console.getDoubleInput("Enter first number");
                Arithmetic sine = new Arithmetic(sineInput);

                sine.sine();
                double sineResult = sine.getResult();
                String finalSineResult = String.valueOf(sineResult);
                Console.println(finalSineResult);

                break;

            case "2":
                Console.println("Cosine selected.");

                double cosineInput = Console.getDoubleInput("Enter first number");
                Arithmetic cosine = new Arithmetic(cosineInput);

                cosine.cosine();
                double cosineResult = cosine.getResult();
                String finalcoSineResult = String.valueOf(cosineResult);
                Console.println(finalcoSineResult);

                break;

            case "3":
                Console.println("Tangent selected.");
                break;

            case "4":
                Console.println("Cosecant selected.");
                break;

            case "5":
                Console.println("Secant selected.");
                break;

            case "6":
                Console.println("Cotangent selected.");
                break;

            case "7":
                Console.println("Degrees mode selected.");
                break;

            case "8":
                Console.println("Radians mode selected.");
                break;

            case "C":
                clearDisplay();
                break;

            case "N":
                currentPage = 3;
                break;

            case "P":
                currentPage = 1;
                break;

            case "H":
                currentPage = 1;
                break;

            default:
                Console.println("Invalid selection.");
        }

        return currentPage;
    }

    public static int handlePageThree(
            String choice,
            int currentPage
    ) {

        switch (choice) {

            case "1":
                Console.println("Inverse sine selected.");
                break;

            case "2":
                Console.println("Inverse cosine selected.");
                break;

            case "3":
                Console.println("Inverse tangent selected.");
                break;

            case "4":
                Console.println("Natural logarithm selected.");
                break;

            case "5":
                Console.println("Base-10 logarithm selected.");
                break;

            case "6":
                Console.println("Exponential function selected.");
                break;

            case "7":
                Console.println("Pi selected.");
                break;

            case "8":
                Console.println("Euler's number selected.");
                break;

            case "C":
                clearDisplay();
                break;

            case "N":
                currentPage = 4;
                break;

            case "P":
                currentPage = 2;
                break;

            case "H":
                currentPage = 1;
                break;

            default:
                Console.println("Invalid selection.");
        }

        return currentPage;
    }

    public static int handlePageFour(
            String choice,
            int currentPage
    ) {

        switch (choice) {

            case "1":
                Console.println("Binary display selected.");
                break;

            case "2":
                Console.println("Octal display selected.");
                break;

            case "3":
                Console.println("Decimal display selected.");
                break;

            case "4":
                Console.println("Hexadecimal display selected.");
                break;

            case "5":
                Console.println("Memory store selected.");
                break;

            case "6":
                Console.println("Memory recall selected.");
                break;

            case "7":
                Console.println("Memory add selected.");
                break;

            case "8":
                Console.println("Memory reset selected.");
                break;

            case "C":
                clearDisplay();
                break;

            case "P":
                currentPage = 3;
                break;

            case "H":
                currentPage = 1;
                break;

            case "B":
                break;

            default:
                Console.println("Invalid selection.");
        }

        return currentPage;
    }

    public static void displayBasicMenu() {

        Console.println("");
        Console.println("====================================");
        Console.println("       SCIENTIFIC CALCULATOR");
        Console.println("      BASIC MATH - PAGE 1 OF 4");
        Console.println("====================================");
        Console.println("1. Addition");
        Console.println("2. Subtraction");
        Console.println("3. Multiplication");
        Console.println("4. Division");
        Console.println("5. Square Root");
        Console.println("6. Power");
        Console.println("7. Modulo");
        Console.println("------------------------------------");
        Console.println("C. Clear Display");
        Console.println("N. Next Page");
        Console.println("B. Back to Start Menu");
        Console.println("====================================");
    }

    public static void displayTrigMenu() {

        Console.println("");
        Console.println("====================================");
        Console.println("       SCIENTIFIC CALCULATOR");
        Console.println("     TRIGONOMETRY - PAGE 2 OF 4");
        Console.println("====================================");
        Console.println("1. Sine");
        Console.println("2. Cosine");
        Console.println("3. Tangent");
        Console.println("4. Cosecant");
        Console.println("5. Secant");
        Console.println("6. Cotangent");
        Console.println("7. Degrees Mode");
        Console.println("8. Radians Mode");
        Console.println("------------------------------------");
        Console.println("C. Clear Display");
        Console.println("N. Next Page");
        Console.println("P. Previous Page");
        Console.println("H. Return to Page 1");
        Console.println("====================================");
    }

    public static void displayInverseAndLogMenu() {

        Console.println("");
        Console.println("====================================");
        Console.println("       SCIENTIFIC CALCULATOR");
        Console.println("    ADVANCED MATH - PAGE 3 OF 4");
        Console.println("====================================");
        Console.println("1. Inverse Sine");
        Console.println("2. Inverse Cosine");
        Console.println("3. Inverse Tangent");
        Console.println("4. Natural Log");
        Console.println("5. Base-10 Log");
        Console.println("6. Exponential");
        Console.println("7. Pi");
        Console.println("8. Euler's Number");
        Console.println("------------------------------------");
        Console.println("C. Clear Display");
        Console.println("N. Next Page");
        Console.println("P. Previous Page");
        Console.println("H. Return to Page 1");
        Console.println("====================================");
    }

    public static void displayNumberSystemAndMemoryMenu() {

        Console.println("");
        Console.println("====================================");
        Console.println("       SCIENTIFIC CALCULATOR");
        Console.println(" NUMBER SYSTEMS/MEMORY - PAGE 4 OF 4");
        Console.println("====================================");
        Console.println("1. Display as Binary");
        Console.println("2. Display as Octal");
        Console.println("3. Display as Decimal");
        Console.println("4. Display as Hexadecimal");
        Console.println("5. Memory Store");
        Console.println("6. Memory Recall");
        Console.println("7. Memory Add");
        Console.println("8. Memory Reset");
        Console.println("------------------------------------");
        Console.println("C. Clear Display");
        Console.println("P. Previous Page");
        Console.println("H. Return to Page 1");
        Console.println("B. Back to Start Menu");
        Console.println("====================================");
    }

    public static void clearDisplay() {

        for (int i = 0; i < 30; i++) {
            Console.println("");
        }

        Console.println("Display cleared.");
    }
}