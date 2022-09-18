package ocp.before;

public class Spider1 {

    private String name;

    public Spider1(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(this.name + " eats flies");
    }
}
