package com.ing.models;

public class PolarBear extends Animal implements Omnivore {
    public PolarBear(String name) {
        this.name = name;
        this.helloText = "On the north pole it's always fun!";
    }

    @Override
    public void eatLeaves() {
        System.out.println("Brrrrrrrrrrh");
    }

    @Override
    public void eatMeat() {
        System.out.println("Grrrrrrrrrrrh");
    }
}
