package example.animals;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Animal> animals = new ArrayList<>();

    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        Elephant elephant = new Elephant();
        Monkey monkey = new Monkey();
        Cat cat = new Cat();

        cat.setLegCount(4);

        zoo.animals.add(elephant);
        zoo.animals.add(monkey);
        zoo.animals.add(cat);

        zoo.animals.forEach(animal ->
                System.out.println(animal.sayHello()));

        zoo.animals.forEach(animal ->
                System.out.println(animal.introduceYourSelf()));
    }
}
