package org.example;

public class Eagle implements Flying, Carnivore{

    @Override
    public void eat(Meat food) {
        System.out.println("Eagle eats "+food.getClass().toString()+".");
    }

    @Override
    public void fly() {
        System.out.println("Eagle is flying.");
    }
}
