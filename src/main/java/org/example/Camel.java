package org.example;

public class Camel implements Terrestrial, Herbivore{
    @Override
    public void eat(Grass food) {
        System.out.println("Camel eats grass.");
    }

    @Override
    public void walk() {
        System.out.println("Camel is walking.");
    }
}
