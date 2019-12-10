package com.ing.models;

public class Hippo extends Animal implements Herbivore {

    public Hippo(String name) {
        this.name = name;
        this.eatText = "munch munch lovely";
        this.helloText = "splash";
    }

    @Override
    public void eatLeaves() {
        System.out.println(this.eatText);
    }
}
