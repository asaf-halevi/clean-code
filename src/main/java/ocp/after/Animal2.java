package ocp.after;

public abstract class Animal2 {

    private String name;

    public Animal2(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void eat();
}
