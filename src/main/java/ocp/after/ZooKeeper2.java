package ocp.after;

import java.util.ArrayList;
import java.util.List;

public class ZooKeeper2 {

    private final List<Animal2> animals;

    public ZooKeeper2() {
        animals = new ArrayList<>();
    }

    public void addAnimal(Animal2 animal) {
        animals.add(animal);
    }

    public void putAnimalsInZoo(Animal2[] addAnimals) {
        for (Animal2 animal : addAnimals) {
            addAnimal(animal);
        }
    }

    public void feedAnimals() {
        for (Animal2 animal : animals) {
            animal.eat();
        }
    }
}
