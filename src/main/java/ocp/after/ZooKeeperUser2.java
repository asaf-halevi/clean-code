package ocp.after;

public class ZooKeeperUser2 {

    public static void main(String[] args) {
        ZooKeeper2 zooKeeper = new ZooKeeper2();
        zooKeeper.addAnimal(new Dog2("Skipper"));
        zooKeeper.addAnimal(new Fish2("Dagi"));
        zooKeeper.addAnimal(new Spider2("Moris"));
        zooKeeper.addAnimal(new Spider2("Boris"));
        zooKeeper.feedAnimals();
    }
}
