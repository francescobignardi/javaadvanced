package javaadvanced.parte2._1;

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
     * Create a class called "Dog" that extends the Animal class.
     *
     * Add a new field called "breed" to the Dog class.
     *
     * Write a constructor for the Dog class that takes in a breed, height, and weight as parameters, and passes the height and weight to the superclass constructor.
     *
     * Write getters and setters for the breed field.
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here

        Dog cane = new Dog(30.5,40.5,"Rottweiler");

        System.out.println("Cane iniziale è alto " + cane.getHeight() + " cm, pesa " + cane.getWeight() +
                " kg ed è di razza " + cane.getBreed());

        cane.setHeight(32.5);
        cane.setWeight(35.5);
        cane.setBreed("Husky");

        System.out.println("Nuovo cane è alto " + cane.getHeight() + " cm, pesa " + cane.getWeight() +
                " kg ed è di razza " + cane.getBreed());
    }

    private static class Dog extends Animal{

        String breed;
        public Dog(double height, double weight, String breed) {
            super(height, weight);
            this.breed = breed;
        }

        public String getBreed() {
            return breed;
        }

        public void setBreed(String breed) {
            this.breed = breed;
        }

        public Double runSpeedMetersPerSecond(){   //Metodo richiesto per esercizio 3
            return getHeight() * 2;
        }


    }


    /**
     * 2:
     *
     *
     * Create new classes called "Fish" and "Bird" that extends the Animal class.
     *
     * Add a new field called "species" to the Fish class and "wingSpan" to the Bird class.
     *
     * Also create constructors, getters and setters
     *
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here

        Fish pesce = new Fish(10.5, 10, "Merluzzo");
        Bird uccello = new Bird(5.5, 1, 30.5);

        System.out.println(pesce.getHeight() + " " + pesce.getWeight() + " " + pesce.getSpecies());
        System.out.println(uccello.getHeight() + " " + uccello.getWeight() + " " + uccello.wingSpan);


    }

    //---------------------------------------------------------------------------------

    private static class Fish extends Animal {  //Nuova classe Fish che estende la classe Animal, con nuova variabile
                                                //Species e relativi getter e setter
        String species;
        public Fish(double height, double weight, String species) {
            super(height, weight);
            this.species = species;
        }

        public String getSpecies() {
            return species;
        }

        public void setSpecies(String species) {
            this.species = species;
        }

        public Double swimSpeedMetersPerSecond(){      //Metodo richiesto per esercizio 3
            return getWeight() * 2;
        }
    }

    //----------------------------------------------------------------------------------

    private static class Bird extends Animal {       //Nuova classe Bird che estende la classe Animal, con nuova variabile
                                                     //wingSpan e relativi getter e setter
        Double wingSpan;

        public Bird(double height, double weight, double wingSpan) {
            super(height, weight);
            this.wingSpan = wingSpan;
        }

        public Double getWingSpan() {
            return wingSpan;
        }

        public void setWingSpan(Double wingSpan) {
            this.wingSpan = wingSpan;
        }

        public Double flySpeedMetersPerSecond(){        //Metodo richiesto per esercizio 3
            return getWingSpan() * 4;
        }
    }


    /**
     * 3:
     *
     * In the dog class create a method called runSpeedMetersPerSecond() that returns the Dog's Height * 2
     * In the fish class create a method called swimSpeedMetersPerSecond() that returns the Fish's Weight * 2
     * In the bird class create a method called flySpeedMetersPerSecond() that returns the Bird's Wingspan * 4
     *
     * Create instances of each Animal: Dog, Fish and Bird. Fill the constructors with values of your choice
     * and print out which of the animals has the fastest movement speed in MetersPerSecond
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here

        Dog cane = new Dog(30.5,40.5,"Collie");
        Fish pesce = new Fish(10.5, 20.5, "Persico");
        Bird uccello = new Bird(4.5,0.2,10.5);

       // List <Double> comparazione = new ArrayList<>();        //Ho provato a usare una lista e un ciclo for
       // Double max = Double.MIN_VALUE;                         //ma diventa secondo me complicato estrarre il nome
                                                                 //dell'animale, ho preferito usare un if
       // comparazione.add(cane.runSpeedMetersPerSecond());
       // comparazione.add(pesce.swimSpeedMetersPerSecond());
       // comparazione.add(uccello.flySpeedMetersPerSecond());

       // for (Double x : comparazione){
       //     if(x > max){
       //         max = x;
       //     }
       // }
       // System.out.println(max);

        if(cane.runSpeedMetersPerSecond() > pesce.swimSpeedMetersPerSecond()
                && cane.runSpeedMetersPerSecond() > uccello.flySpeedMetersPerSecond()){
            System.out.println("Il cane è quello che si muove più veloce");
        } else if (pesce.swimSpeedMetersPerSecond() > cane.runSpeedMetersPerSecond()
        && pesce.swimSpeedMetersPerSecond() > uccello.flySpeedMetersPerSecond()){
            System.out.println("Il pesce è quello che si muove più veloce");
        } else {
            System.out.println("L'uccello è quello che si muove più veloce");
        }

    }
}
