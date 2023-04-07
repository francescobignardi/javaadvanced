package javaadvanced._6;

public enum Seasons {

    WINTER("Questa stagione inizia il 22 dicembre e finisce il 20 marzo"),
    SPRING("Questa stagione inizia il 21 marzo e finisce il 20 giugno"),
    SUMMER("Questa stagione inizia il 21 giugno e finisce il 22 settembre"),
    AUTUMN("Questa stagione inizia il 23 settembre e finisce il 21 dicembre");

    String monthsRange;

    Seasons(String monthsRange){
        this.monthsRange = monthsRange;
    }

}
