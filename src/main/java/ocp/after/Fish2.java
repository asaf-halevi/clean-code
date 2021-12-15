package ocp.after;

public class Fish2 extends Animal2 {

    public Fish2(String name) {
        super(name);
    }

    public void eat() {
        System.out.println(this.getName() + " eats smaller fish");
    }
}
