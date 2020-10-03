package lsp;

public class ZooKeeperUser3 {
	
	public static void main(String[] args) {
		ZooKeeper3 zooKeeper = new ZooKeeper3();
		zooKeeper.addAnimal(new Dog3("Skipper"));
		zooKeeper.addAnimal(new Fish3("Dagi"));
		zooKeeper.addAnimal(new Spider3("Moris"));	
		zooKeeper.feedAnimals();
	}
}
