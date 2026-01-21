//package org.example;
//public class InvalidMenuChoiceException extends Exception {
//    public InvalidMenuChoiceException(String message) {
//        super(message);
//    }
//}
//
//package org.example;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        while (true) {
//            try {
//                run();
//                break;
//            } catch (InvalidMenuChoiceException e) {
//                System.out.println("An error occurred: " + e.getMessage());
//            }
//        }
//    }
//
//    public static void run() throws InvalidMenuChoiceException {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Welcome to the student registration system!");
//        System.out.println("1. Register a student");
//        System.out.println("2. View all students");
//        System.out.println("3. Exit");
//        int choice = scanner.nextInt();
//
//        if (choice == 1) {
//            System.out.println("(Register a student...)");
//        } else if (choice == 2) {
//            System.out.println("(View all students...)");
//        } else if (choice == 3) {
//            System.exit(0);
//        } else {
//            throw new InvalidMenuChoiceException("Invalid input (1-3 required)");
//        }
//    }
//}





package org.example;

/**
 * Custom exception for dividing by zero.
 */
public class CustomDivideByZeroException extends Exception {

    /**
     * The numerator of the failed division operation.
     */

    private double a;

    /**
     * The denominator of the failed division operation.
     */
    private double b;

    /**
     * Get the numerator of the failed division operation.
     *
     * @return The numerator of the failed division operation.
     */
    public double getA() {
        return a;
    }

    /**
     * Get the denominator of the failed division operation.
     *
     * @return The denominator of the failed division operation.
     */
    public double getB() {
        return b;
    }

    /**
     * Constructor for the CustomDivideByZeroException.
     */
    public CustomDivideByZeroException(double a, double b) {
        super("Attempted to divide " + a + " by " + b);
        this.a = a;
        this.b = b;
    }
}
