package com.ing.models;

import java.util.Random;

public class Pig extends Animal implements Omnivore {
    public String trick;

    public Pig(String name) {
        this.name = name;
        this.helloText = "splash";
    }

    public void eatLeaves() {
        this.eatText = "munch munch oink";
        System.out.println(this.eatText);
    }

    public void eatMeat() {
        this.eatText = "nomnomnom oink thx";
        System.out.println(this.eatText);
    }

    @Override
    public void performTrick() {
        Random random = new Random();
        if (random.nextInt(2) == 0) {
            trick = "rolls in the mud";
        } else {
            trick = "runs in circles";
        }
        System.out.println(trick);
    }
}
