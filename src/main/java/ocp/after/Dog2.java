package ocp.after;

public class Dog2 extends Animal2 {

    public Dog2(String name) {
        super(name);
    }

    public void eat() {
        System.out.println(this.getName() + " eats meat");
    }
}
