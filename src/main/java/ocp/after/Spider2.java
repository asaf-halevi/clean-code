package ocp.after;

public class Spider2 extends Animal2 {

    public Spider2(String name) {
        super(name);
    }

    public void eat() {
        System.out.println(this.getName() + " eats flies");
    }
}
