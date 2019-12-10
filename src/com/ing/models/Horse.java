package com.ing.models;

import java.util.Random;

public class Horse extends Animal implements Herbivore {

    public Horse(String name) {
        this.name = name;
        this.helloText = "neigh";
        this.eatText = "Hionnk";
    }

    @Override
    public void eatLeaves() {
        System.out.println(this.eatText);
    }

    @Override
    public void performTrick() {
        Random random = new Random();
        if (random.nextInt(2) == 0) {
            System.out.println("bows for the crowd");
        } else {
            System.out.println("jumps over the obstacle");
        }
    }
}
