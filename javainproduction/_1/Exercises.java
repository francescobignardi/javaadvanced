package javaadvanced.javainproduction._1;


import java.math.BigDecimal;
import java.math.BigInteger;

public class Exercises {

    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();

    }
    /**
     * 1:
     *
     *
     * In the main method, create a variable x as a random number between 0-100 using Math.random() * 100;
     *
     * Use a ternary operator to check if x is greater than or equal to 50. If it is, print "x is greater than or equal to 50". If it's not, print "x is less than 50".
     *
     * Experiment with different values of x and observe the output
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here

        double x = Math.random()*100;

        System.out.println(x);
        String y = x >= 50 ? "x is greater or equal to 50" : "x is less than 50";
        System.out.println(y);

    }

    /**
     * 2:
     *
     *
     * Create a record called "Person" with fields for name, age and address.
     *
     * Add a toString method to Person to print out the data in a different format
     *
     * Print the record to the console
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here

        Person persona = new Person("El Barto", 10, "742 Evergreen Terrace");

        System.out.println(persona.name());
        System.out.println(persona.age());
        System.out.println(persona.address());
        System.out.println(persona);


    }

    /**
     * 3:
     *
     *
     * In the main method, create a BigInteger variable with a large value.
     *
     * Create a BigDecimal variable with a large value
     *
     * Divide the BigInteger by 3 using the divide method and assign the result to a new BigInteger variable
     *
     * Divide the BigDecimal by Math.PI using the divide method and assign the result to a new BigDecimal variable
     *
     * Print the results
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here

        BigInteger numero1 = new BigInteger("100000000000000000000");  //BigInteger
        BigDecimal numero2 = new BigDecimal("0.2222222222222222222");  //BigDecimal

        BigInteger numero3 = numero1.divide(BigInteger.valueOf(3));        //Divido BigInteger per 3
        System.out.println(numero3);                                       //Stampo il nuovo BigInteger

        try{
            BigDecimal numero4 = numero2.divide(BigDecimal.valueOf(Math.PI));  //Uso un trycatch perché dividendo
            System.out.println(numero4);                                       //un BigDecimal per Math.PI mi lancia
        } catch (ArithmeticException e){                                       //sempre una ArithmeticException
            System.out.println("Numero non rappresentabile in console");
        }
    }

}
