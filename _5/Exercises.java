package javaadvanced._5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {
        //exercise1();
        //exercise2();
        //exercise3();
        exercise4();
    }

    /**
     * 1: Uncomment the Files.createFile() line below and write a try catch block that
     *    prints it's stack trace
     */
    private static void exercise1() {
        System.out.println("Exercise 1: ");
        // Your code here
        try{
            Files.createFile(Path.of("Test.txt"));
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 2:
     *
     * Write a try-catch block that attempts to open a file
     *
     * In the catch block, print a message that informs the user that the file could not be found.
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here
        try {
            String userInputFileName = "test-file.txt";
            File file = new File(userInputFileName);
            Scanner scanner = new Scanner(file);
            System.out.println(scanner);
        } catch (Exception exception){
            System.err.println("Errore, file non trovato");
            exception.printStackTrace();
            System.exit(0);
        }
    }

    /**
     * 3:
     *
     * Write a try-catch block that attempts to parse a string as an integer.
     *
     * In the catch block, print a message that informs the user that the input was not a valid integer.
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here                         // Quale dei due metodi è più giusto?

    //    try{
    //        Integer.parseInt("house");
    //    } catch (NumberFormatException numberFormatException){
    //        throw new NumberFormatException("Impossibile convertire la stringa in integer");
    //    }

        try{
            Integer.parseInt("house");
        } catch (NumberFormatException numberFormatException){
            numberFormatException.printStackTrace();
        }
        throw new NumberFormatException("Impossibile convertire la stringa in integer");
    }

    /**
     * 4:
     *
     * Write a try block around this print statement that attempts to divide 2 numbers
     *
     * Create multiple catch blocks that catch different types of exceptions, such as NumberFormatException and DivideByZeroException.
     *
     * In each catch block, print a message that informs the user of the specific exception that was caught and why it occurred.
     *
     */
    private static void exercise4() {
        System.out.println("\nExercise 4: ");
        // Your code here

        Double num1 = 10.0;
        String num2AsString = "0.0";
        Double result = num1/Double.parseDouble(num2AsString);

        try{
            System.out.println(result);
        } catch (NumberFormatException numberFormatException){
            throw new NumberFormatException("Impossibile castare stringa in double");
        } catch (Exception exception){
            if (result.isInfinite()){
                System.out.println("Impossibile dividere per zero");
            }
        }
        // Your catch blocks here

    }
}
