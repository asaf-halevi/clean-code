package isp.after;

import java.util.ArrayList;
import java.util.List;

public class AnimalManager5 {
    public static void main(String[] args) {
        List<Animal5> animals = new ArrayList<>();
        animals.add(new Duck5());
        animals.add(new Tiger5());
        animals.forEach(Animal5::eat);
        //                animals.forEach(Animal5::fly);
    }
}
