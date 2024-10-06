package org.example;

public class Main {
    public static void main(String[] args) {
        Eagle eagle = new Eagle();
        eagle.eat(new FishMeat());
        eagle.eat(new Beef());
        eagle.fly();

        Horse horse = new Horse();
        horse.eat(new Grass());
        horse.walk();

        Camel camel = new Camel();
        camel.eat(new Grass());
        camel.walk();

        Tiger tiger = new Tiger();
        tiger.eat(new Beef());
        tiger.walk();

        Dolphin dolphin = new Dolphin();
        dolphin.eat(new FishMeat());
        dolphin.swim();
    }
}