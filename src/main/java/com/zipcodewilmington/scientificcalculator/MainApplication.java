

package com.zipcodewilmington.scientificcalculator;

import java.awt.Desktop;
import java.net.URI;

public class MainApplication {

    public static void main(String[] args) {

        boolean programRunning = true;

        while (programRunning) {

            displayStartMenu();

            String startChoice = Console
                    .getStringInput("Enter your choice: ")
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
    }

    public static void startCalculator() {

        boolean calculatorRunning = true;
        int currentPage = 1;

        Calculator calculator = new Calculator();
        String mode = "RAD";

        while (calculatorRunning) {

            displayCurrentPage(currentPage);

            String choice = Console
                    .getStringInput("Enter selection: ")
                    .trim()
                    .toUpperCase();

            switch (currentPage) {

                case 1:
                    currentPage = handlePageOne(
                            choice,
                            currentPage,
                            calculator
                    );

                    if (choice.equals("B")) {
                        calculatorRunning = false;
                    }

                    break;

                case 2:
//                     currentPage = handlePageTwo(
//                             choice,
//                             currentPage,
//                             calculator,
//                             mode
//                     );
                
                    PageResult pageTwoResult = handlePageTwo(choice, currentPage, calculator, mode);
                
                    currentPage = pageTwoResult.getCurrentPage();
                    mode = pageTwoResult.getMode();

                    break;

                case 3:
                    currentPage = handlePageThree(
                            choice,
                            currentPage
                    );
                    break;

                case 4:
                    currentPage = handlePageFour(
                            choice,
                            currentPage,
                            calculator
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
            int currentPage,
            Calculator calculator
    ) {

        switch (choice) {

            case "1": {
                Console.println("Addition selected.");

                double num1 =
                        Console.getDoubleInput("Enter first number: ");

                double num2 =
                        Console.getDoubleInput("Enter second number: ");

                Arithmetic add = new Arithmetic(num1);

                add.add(num2);

                double result = add.getResult();

                    if (result == 67) {
                        secretFeature1();
                    } else if (result == 69) {
                        secretFeature2();
                    }

                calculator.setCurrentValue(result);

                Console.println(String.valueOf(result));
                break;
            }

            case "2": {
                Console.println("Subtraction selected.");

                double num1 =
                        Console.getDoubleInput("Enter first number: ");

                double num2 =
                        Console.getDoubleInput("Enter second number: ");

                Arithmetic subtract = new Arithmetic(num1);

                subtract.subtract(num2);

                double result = subtract.getResult();

                if (result == 67) {
                    secretFeature1();
                } else if (result == 69) {
                    secretFeature2();
                }

                calculator.setCurrentValue(result);

                Console.println(String.valueOf(result));
                break;
            }

            case "3": {
                Console.println("Multiplication selected.");

                double num1 =
                        Console.getDoubleInput("Enter first number: ");

                double num2 =
                        Console.getDoubleInput("Enter second number: ");

                Arithmetic multiply = new Arithmetic(num1);

                multiply.multiply(num2);

                double result = multiply.getResult();

                if (result == 67) {
                    secretFeature1();
                } else if (result == 69) {
                    secretFeature2();
                }

                calculator.setCurrentValue(result);

                Console.println(String.valueOf(result));
                break;
            }

            case "4": {
                Console.println("Division selected.");

                double num1 =
                        Console.getDoubleInput("Enter first number: ");

                double num2 =
                        Console.getDoubleInput("Enter second number: ");

                try {

                    Arithmetic divide = new Arithmetic(num1);

                    divide.divide(num2);

                    double result = divide.getResult();

                    if (result == 67) {
                    secretFeature1();
                } else if (result == 69) {
                    secretFeature2();
                }

                    calculator.setCurrentValue(result);

                    Console.println(String.valueOf(result));

                } catch (ArithmeticException exception) {

                    Console.println(
                            "Invalid input. You cannot divide by 0."
                    );
                }

                break;
            }

            case "5": {
                Console.println("Square root selected.");

                double number =
                        Console.getDoubleInput("Enter number: ");

                Arithmetic squareRoot = new Arithmetic(number);

                squareRoot.squareRoot(number);

                double result = squareRoot.getResult();

                if (result == 67) {
                    secretFeature1();
                } else if (result == 69) {
                    secretFeature2();
                }
                calculator.setCurrentValue(result);

                Console.println(String.valueOf(result));
                break;
            }

            case "6": {
                Console.println("Power selected.");

                double base =
                        Console.getDoubleInput("Enter first number: ");

                double exponent =
                        Console.getDoubleInput("Enter second number: ");

                Arithmetic power = new Arithmetic(base);

                power.power(exponent);

                double result = power.getResult();

                if (result == 67) {
                    secretFeature1();
                } else if (result == 69) {
                    secretFeature2();
                }

                calculator.setCurrentValue(result);

                Console.println(String.valueOf(result));
                break;
            }

            case "7": {
                Console.println("Modulo selected.");

                double num1 =
                        Console.getDoubleInput("Enter first number: ");

                double num2 =
                        Console.getDoubleInput("Enter second number: ");

                Arithmetic modulo = new Arithmetic(num1);

                modulo.modulo(num2);

                double result = modulo.getResult();

                if (result == 67) {
                    secretFeature1();
                } else if (result == 69) {
                    secretFeature2();
                }

                calculator.setCurrentValue(result);

                Console.println(String.valueOf(result));
                break;
            }

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


    public static PageResult handlePageTwo(
        String choice,
        int currentPage,
        Calculator calculator,
        String mode
) {

        switch (choice) {
            case "1":
                Console.println("Sine selected.");

                double sineInput = Console.getDoubleInput("Enter first number");

                if (mode.equals("DEG")) {
                    sineInput = Math.toRadians(sineInput);
                }
                Arithmetic sine = new Arithmetic(sineInput);

                sine.sine();

                double sineresult = sine.getResult();

                calculator.setCurrentValue(sineresult);

                Console.println(String.valueOf(sineresult));
                break;
            
            case "2": {
                Console.println("Cosine selected.");

                double cosineInput = Console.getDoubleInput("Enter first number");

                if (mode.equals("DEG")) {
                    cosineInput = Math.toRadians(cosineInput);
                }

                Arithmetic cosine = new Arithmetic(cosineInput);

                cosine.cosine();

                double cosineresult = cosine.getResult();

                calculator.setCurrentValue(cosineresult);

                Console.println(String.valueOf(cosineresult));
                break;
            }

            case "3": {
                Console.println("Tangent selected.");

                double tangentInput = Console.getDoubleInput("Enter first number");

                if (mode.equals("DEG")) {
                    tangentInput = Math.toRadians(tangentInput);
                }

                Arithmetic tangent = new Arithmetic(tangentInput);

                tangent.tangent();

                double tangentresult = tangent.getResult();

                calculator.setCurrentValue(tangentresult);

                Console.println(String.valueOf(tangentresult));
                break;
            }

            case "4": {
                Console.println("Cosecant selected.");

                double cosecantInput = Console.getDoubleInput("Enter first number");

                 if (mode.equals("DEG")) {
                    cosecantInput = Math.toRadians(cosecantInput);
                }

                Arithmetic cosecant = new Arithmetic(cosecantInput);

                cosecant.cosecant();

                double cosecantresult = cosecant.getResult();

                calculator.setCurrentValue(cosecantresult);

                Console.println(String.valueOf(cosecantresult));
                break;
            }

            case "5": {
                Console.println("Secant selected.");

                double secantInput = Console.getDoubleInput("Enter first number");

                 if (mode.equals("DEG")) {
                    secantInput = Math.toRadians(secantInput);
                }

                Arithmetic secant = new Arithmetic(secantInput);

                secant.secant();

                double secantresult = secant.getResult();

                calculator.setCurrentValue(secantresult);

                Console.println(String.valueOf(secantresult));
                break;
            }

            case "6": {
                Console.println("Cotangent selected.");

                double cotangentInput = Console.getDoubleInput("Enter first number");

                if (mode.equals("DEG")) {
                    cotangentInput = Math.toRadians(cotangentInput);
                }

                Arithmetic cotangent = new Arithmetic(cotangentInput);

                cotangent.cotangent();

                double cotangentresult = cotangent.getResult();

                calculator.setCurrentValue(cotangentresult);

                Console.println(String.valueOf(cotangent));
                break;
            }

                case "7":
                Console.println("Degrees mode selected.");
                mode = "DEG";
                break;

            case "8":
                Console.println("Radians mode selected.");
                mode = "RAD";
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

        PageResult chosenPage = new PageResult(currentPage, mode);
    
        return chosenPage;
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
            int currentPage,
            Calculator calculator
    ) {

        switch (choice) {

            case "1":
                Console.println("Binary display selected.");
                Console.println(calculator.displayBinary());
                break;

            case "2":
                Console.println("Octal display selected.");
                Console.println(calculator.displayOctal());
                break;

            case "3":
                Console.println("Decimal display selected.");
                Console.println(calculator.displayDecimal());
                break;

            case "4":
                Console.println("Hexadecimal display selected.");
                Console.println(calculator.displayHexadecimal());
                break;

            case "5":
                calculator.memoryStore();

                Console.println(
                        "Stored in memory: "
                                + calculator.getMemory()
                );
                break;

            case "6":
                Console.println(
                        "Memory recalled: "
                                + calculator.memoryRecall()
                );
                break;

            case "7":
                calculator.memoryAdd();

                Console.println(
                        "Current value added to memory."
                );

                Console.println(
                        "Memory: " + calculator.getMemory()
                );
                break;

            case "8":
                calculator.memoryReset();
                Console.println("Memory reset to 0.");
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

     public static void secretFeature1() {
        try { Desktop.getDesktop().browse(new URI("https://www.tiktok.com/@notanothercomchannel/video/7548521677651528991?lang=en"));

        } catch (Exception e) {            
        // TODO: handle exception            startCalculator();        }    }
}
     }
    public static void secretFeature2() {
    try {
        Desktop.getDesktop().browse(
            new URI("https://www.tiktok.com/t/ZTStHp5kp/")
        );
    } catch (Exception e) {
    }
}
}