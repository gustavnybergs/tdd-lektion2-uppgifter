package com.gustavnybergs.uppgifter.uppgift4;

import com.gustavnybergs.uppgifter.uppgift4.models.Bird;
import com.gustavnybergs.uppgifter.uppgift4.models.Dog;
import com.gustavnybergs.uppgifter.uppgift4.models.IAnimal;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<IAnimal> animals = new ArrayList();
        animals.add(new Dog());
        animals.add(new Bird());

        for (IAnimal animal : animals) {
            animal.makeSound();
        }
    }

}
