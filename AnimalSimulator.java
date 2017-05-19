import java.util.ArrayList;
import java.util.List;

public class AnimalSimulator {
    public static void main(String... args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Dog("Pochi"));
        animals.add(new Cat("Mike"));
        animals.add(new Dog("Tom"));
        animals.add(new Cat("Michael"));

        for (Animal animal : animals) {
            System.out.println(animal.callName());
        }
        /*
            [Dog]Hey! Pochi!
            bowbow!
            [Cat]Hey! Mike!
            meow
            [Dog]Hey! Tom!
            bowbow!
            [Cat]Hey! Michael!
            meow
        */
    }
}
