package org.example;

public class Dolphin implements Aquatic, Carnivore{

    @Override
    public void swim() {
        System.out.println("Dolphin is swimming.");
    }

    @Override
    public void eat(Meat food) {
        if (food.getClass() != FishMeat.class) {
            System.out.println("Dolphin can eat only fish meat. Nothing happens.");
            return;
        }
        System.out.println("Dolphin eats fish meat.");
    }
}
