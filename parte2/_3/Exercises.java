package javaadvanced.parte2._3;

import java.util.Objects;

public class Exercises {

    public static void main(String[] args) {
        exercise1();
        exercise2();
    }
    /**
     * 1:
     *
     *
     * Create a class called "Person" with fields for name, age, and address.
     *
     * Override the `toString()` method in the Person class to display the object's name, age, and address in a user-friendly format.
     *
     * Create instances of the Person class and print them using the overridden `toString()` method.
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here

        Person persona = new Person("Fabio", 25, "Via Roma 12");
        System.out.println(persona);

    }

    private static class Person{

        String name;
        Integer age;
        String address;

        public Person(String name, Integer age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", address='" + address + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Person person)) return false;
            return Objects.equals(name, person.name) && Objects.equals(age, person.age) && Objects.equals(address, person.address);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age, address);
        }
    }

    /**
     * 2:
     *
     *
     * Override the `hashCode()` method in the Person class to generate a unique hash code based on the object's name, age, and address.
     *
     * You can achieve this by using String.hashCode() to convert strings to ints and adding the fields together
     *
     * Create 2 people and print out their hashcodes
     */
    private static void exercise2() {
        System.out.println("\nExercise 1: ");
        // Your code here

        Person persona1 = new Person("Bart", 10, "Via Fasulla 123");
        Person persona2 = new Person("Paolo", 30, "Via Napoli 1");

        System.out.println(persona1.hashCode());
        System.out.println(persona2.hashCode());

        Person persona3 = new Person("Fabio", 20, "Via Firenze 12");  //Prove con istanze uguali
        Person persona4 = new Person("Fabio", 20, "Via Firenze 12");

        System.out.println(persona3.equals(persona4));                    // ---> true
        System.out.println(persona3.hashCode() == persona4.hashCode());   // ---> true
    }

    /**
     * 3:
     *
     * BONUS: Read about the nuances of hashcodes here:
     *
     * https://www.baeldung.com/java-hashcode
     *
     * Don't necessarily expect to understand it all right away, it can get quite complicated
     *
     */
}
