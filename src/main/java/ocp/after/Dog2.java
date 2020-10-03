package ocp.after;

public class Dog2 implements Animal2 {

    private String name;

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public Dog2 (String name) {
        this.name = name;
    }

    public void eat () {
        System.out.println (this.getName () + " eats meat");
    }
}
