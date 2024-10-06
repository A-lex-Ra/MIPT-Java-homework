package org.example;

public class Horse implements Herbivore, Terrestrial{
    @Override
    public void eat(Grass food) {
        System.out.println("Horse eats grass.");
    }

    @Override
    public void walk() {
        System.out.println("Horse is walking.");
    }
}
