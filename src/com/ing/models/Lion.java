package com.ing.models;

public class Lion extends Animal implements Carnivore {

    public Lion(String name) {
        this.name = name;
        this.eatText = "nomnomnom thx mate";
        this.helloText = "roooaoaaaaar";
    }

    @Override
    public void eatMeat() {
        System.out.println(eatText);
    }
}
