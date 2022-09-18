package ocp.after;

public class ZooKeeperUser2 {

    public static void main(String[] args) {
        ZooKeeper2 zooKeeper = new ZooKeeper2();
        zooKeeper.putAnimalsInZoo(new Animal2[]{
                new Dog2("Skipper"),
                new Fish2("Dagi"),
                new Spider2("Moris"),
                new Spider2("Boris")
        });
        zooKeeper.feedAnimals();
    }
}
