package com.ing.driver;

import com.ing.models.*;

import java.util.Arrays;
import java.util.Scanner;

public class Zoo {
    public static void main(String[] args) {
        String welcome = "hello";
        String givePlants = "give leaves";
        String giveMeat = "give meat";
        String preformTrick = "perform trick";

        // Create all animals for the user to see
        Animal[] zooAnimals = new Animal[7];
        zooAnimals[0] = new Lion("henk");
        zooAnimals[1] = new Hippo("elsa");
        zooAnimals[2] = new Pig("dora");
        zooAnimals[3] = new Tiger("wally");
        zooAnimals[4] = new Zebra("marty");
        zooAnimals[5] = new Horse("anico");
        zooAnimals[6] = new PolarBear("coco");

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        // Display all the animals to the user
        System.out.println("All animals:");
        Arrays.stream(zooAnimals).forEach(System.out::println);

        // Enter a new line for readability
        System.out.println();

        while (running) {
            System.out.print("Enter in your command: ");

            String input = scanner.nextLine();

            // Check if the input is hello plus the name of a animal
            Animal found = Arrays.stream(zooAnimals)
                    .filter(animal -> ("hello " + animal.getName()).equals(input)).findFirst().orElse(null);

            if (found != null) {
                found.sayHello();
            } else if (input.equals(welcome)) {
                Arrays.stream(zooAnimals).forEach(Animal::sayHello);
            } else if (input.equals(givePlants)) {
                Arrays.stream(zooAnimals).filter(animal -> animal instanceof Herbivore || animal instanceof Omnivore)
                        .forEach(animal -> {
                            if (animal instanceof Herbivore) {
                                ((Herbivore) animal).eatLeaves();
                            } else {
                                ((Omnivore) animal).eatLeaves();
                            }
                        });
            } else if (input.equals(giveMeat)) {
                Arrays.stream(zooAnimals).filter(animal -> animal instanceof Carnivore || animal instanceof Omnivore)
                        .forEach(animal -> {
                            if (animal instanceof Carnivore) {
                                ((Carnivore) animal).eatMeat();
                            } else {
                                ((Omnivore) animal).eatMeat();
                            }
                        });
            } else if (input.equals(preformTrick)) {
                Arrays.stream(zooAnimals).forEach(Animal::performTrick);
            } else if (input.equals("stop")) {
                running = false;
            } else {
                System.out.println("Unknown command: " + input);
            }
        }
    }
}
