package com.gustavnybergs.uppgifter.uppgift4.models;

public class Dog implements IAnimal {

    @Override
    public void makeSound() {
        System.out.println("Dog is barking");
    }
}