package isp.before;

import java.util.ArrayList;
import java.util.List;


public class AnimalManager4 {
    public static void main(String[] args) {
        List<Animal4> animals = new ArrayList<>();
        animals.add(new Duck4());
        animals.add(new Tiger4());
        animals.forEach(Animal4::eat);
        //        animals.forEach(Animal4::fly);
    }
}
