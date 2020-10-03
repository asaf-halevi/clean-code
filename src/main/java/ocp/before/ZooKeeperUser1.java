package ocp.before;

public class ZooKeeperUser1 {
	
	public static void main(String[] args) {
		ZooKeeper1 zooKeeper = new ZooKeeper1();
		zooKeeper.putAnimalsInZoo();
		zooKeeper.feedAnimals();
	}
}
