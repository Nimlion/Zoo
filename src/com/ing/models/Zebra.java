package com.ing.models;

public class Zebra extends Animal implements Herbivore {
    // I would've expected that preformTrick is later going to be implemented?
    public String trick;

    public Zebra(String name) {
        this.name = name;
        this.eatText = "munch munch zank yee bra";
        this.helloText = "zebra zebra";
    }

    public void eatLeaves() {
        System.out.println(this.eatText);
    }
}
