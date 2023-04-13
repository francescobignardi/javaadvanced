package javaadvanced.parte2._2;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }
    /**
     * 1:
     *
     * Create an abstract class called "Shape" with fields of height and width
     *
     * Create classes called "Rectangle" and "Circle" that extend the GeometricShape class and implement the calculateArea() method.
     *
     * Create instances of both and calculate their area
     *
     * To calculate the area copy the following code:  Math.PI * Math.pow((height / 2), 2)
     *
     * BONUS: Make sure the height and width values are exactly the same for Circle, change the constructor to do this
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here

        Rectangle rettangolo = new Rectangle(12.1,14.5);  //Istanzio le due classi
        Circle cerchio = new Circle(25.0);

        Double areaRettangolo = rettangolo.calculateArea();           //Stampo le aree
        Double areaCerchio = cerchio.calculateArea();

        System.out.println("L'area del rettangolo è: " + areaRettangolo);
        System.out.println("L'area del cerchio è: " + areaCerchio);

    }

    private static abstract class GeometricShape{          //Classe astratta con due parametri, un metodo e
                                                           //Il costruttore
        Double height;
        Double width;

        public GeometricShape(Double height, Double width) {
            this.height = height;
            this.width = width;
        }

        abstract Double calculateArea();
    }

    private static class Rectangle extends GeometricShape{      //Classe rettangolo "figlia" di GeometricShape
                                                                //Con costruttore e metodo calculateArea sovrascritto

        public Rectangle(Double height, Double width) {
            super(height, width);
        }

        @Override
        Double calculateArea() {
            return Math.PI * Math.pow((height / 2), 2);
        }
    }

    private static class Circle extends GeometricShape{      //Classe cerchio "figlia" di GeometricShape con
                                                             //Costruttore e metodo calculateArea sovrascritto

        public Circle(Double height) {                       //Per impedire che height e width siano diversi ho
            super(height, height);                           //Pensato di passare solo height. Non so se sia la
        }                                                    //Soluzione corretta richiesta.

        @Override
        Double calculateArea() {
            return Math.PI * Math.pow((height / 2), 2);
        }
    }


    /**
     * 2:
     *
     *
     * Create an interface class called "Movable" that has the following methods: moveForward, moveBackward
     *
     * Create classes called "Car" and "Boat" that implement the Movable Interface
     *
     * Write code below that creates instances of both the Car and Boat class and demonstrates the use of the methods from the Movable interface.
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here

        Car auto = new Car();               //Creo istanze delle classi e stampo i relativi metodi
        Boat barca = new Boat();

        auto.moveForward();
        auto.moveBackward();

        barca.moveForward();
        barca.moveBackward();


    }

    private interface Movable{               // Creo interfaccia Movable con i due metodi moveForward e moveBackward

        void moveForward();
        void moveBackward();

    }

    private static class Car implements Movable {   // Classe Car che implementa l'interfaccia Movable con i suoi
                                                    // Due metodi
        @Override
        public void moveForward() {
            System.out.println("L'auto va avanti");
        }

        @Override
        public void moveBackward() {
            System.out.println("L'auto va indietro");
        }
    }

    private static class Boat implements Movable{     // Classe Boat che implementa interfaccia Movable con i suoi
                                                      // Due metodi
        @Override
        public void moveForward() {
            System.out.println("La barca va avanti");
        }

        @Override
        public void moveBackward() {
            System.out.println("La barca va indietro");
        }

    }

    /**
     * 3:
     *
     *
     * Create an interface called "Playable" with an abstract method called "play()".
     *
     * Create an abstract class called "Instrument" that implements the Playable interface and contains the fields "name" and "brand".
     *
     * Create classes called "Guitar" and "Piano" that extend the Instrument class and implement the play() method.
     *
     * Write code below that creates instances of both the Guitar and Piano class and demonstrates the use of the play() method.
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here

        Guitar chitarra = new Guitar();
        Piano pianoforte = new Piano();

        chitarra.play();
        pianoforte.play();
    }

    private interface Playable{                           // Interfaccia Playable con metodo play();
        void play();

    }

    private static abstract class Instrument implements Playable{  // Classe astratta Instrument che implementa l'interfaccia
                                                                   // Playable e contiene due variabili name e brand
        String name;
        String brand;

    }

    private static class Guitar extends Instrument{     // Classe Guitar che estende classe astratta Instrument e ne
                                                        // Eredita il metodo play(), a sua volta implementato dall'interfaccia
        @Override
        public void play() {
            System.out.println("Suono la chitarra");
        }
    }

    private static class Piano extends Instrument{     // Classe Piano che estende classe astratta Instrument e ne
                                                       // Eredita il metodo play(), a sua volta implementato dall'interfaccia

        @Override
        public void play() {
            System.out.println("Suono il pianoforte");
        }
    }
}
