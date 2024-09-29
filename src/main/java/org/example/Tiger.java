package org.example;

public class Tiger implements Carnivore, Terrestrial{


    public void eat(Meat food) {
        if (food.getClass() != Beef.class) {
            System.out.println("Tiger can eat only beef. Nothing happens.");
            return;
        }
        System.out.println("Tiger eats beef.");
    }

    @Override
    public void walk() {
        System.out.println("Tiger is walking.");
    }
}
