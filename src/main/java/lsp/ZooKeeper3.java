package lsp;

import java.util.ArrayList;
import java.util.List;

public class ZooKeeper3 {

	private List<Animal3> animals;

	public ZooKeeper3() {
		animals = new ArrayList<>();
	}

	public void addAnimal(Animal3 animal) {
		animals.add(animal);
	}

	public void feedAnimals() {
		for (Animal3 animal : animals) {
			animal.eat();
		}
	}
}
