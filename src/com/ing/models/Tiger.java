package com.ing.models;

import java.util.Random;

public class Tiger extends Animal implements Carnivore {
    public String trick;

    public Tiger(String name) {
        this.name = name;
        this.eatText = "nomnomnom oink wubalubadubdub";
        this.helloText = "rraaarww";
    }

    public void eatMeat() {
        System.out.println(this.eatText);
    }

    @Override
    public void performTrick() {
        Random random = new Random();
        if (random.nextInt(2) == 0) {
            trick = "jumps in tree";
        } else {
            trick = "scratches ears";
        }
        System.out.println(trick);
    }
}
