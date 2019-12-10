package com.ing.models;

public abstract class Animal {
    String name;
    String helloText;
    String eatText;

    public void sayHello() {
        System.out.println(this.helloText);
    }

    public void performTrick() {}

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "\t" + "name:" + name;
    }

    public String getName() {
        return name;
    }
}
