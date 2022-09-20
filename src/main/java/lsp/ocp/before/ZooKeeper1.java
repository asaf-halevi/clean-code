package lsp.ocp.before;

import ocp.before.Dog1;
import ocp.before.Fish1;

public class ZooKeeper1 {
    Dog1 dog;
    Fish1 fish;

    public void putAnimalsInZoo() {
        dog = new Dog1("Skipper");
        fish = new Fish1("Dagi");
    }

    public void feedAnimals() {
        dog.eat();
        fish.eat();
    }
}
