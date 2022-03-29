import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnimalTest {
    public static void main(String[] args)  {
        Animal animal1 = new Dog("Ada");
        Animal animal2 = new Fox("Swiper");
        Animal animal3 = new Mouse("Mickey");

        Animal[] animalArray = new Animal[3];
        animalArray[0] = animal1;
        animalArray[1] = animal2;
        animalArray[2] = animal3;

        System.out.println("Animal list before sorting: ");
        for(var animal : animalArray) System.out.println(animal);

        Arrays.sort(animalArray);

        System.out.println("Animal list after sorting: ");
        for(var animal : animalArray) System.out.println(animal);


        List<Animal> animalList = new ArrayList<>();
        animalList.add(animal1);
        animalList.add(animal2);
        animalList.add(animal3);

        System.out.println("Animal list before sorting (backward): " + animalList);
        animalList.sort((a1, a2) -> -a1.getName().compareTo(a2.getName()));
        System.out.println("Animal list after sorting (backward): " + animalList);


        System.out.println("Animal Names: ");
        System.out.println(animal1.getName());
        System.out.println(animal2.getName());
        System.out.println(animal3.getName());

        System.out.println("Animal toString method calls: ");
        System.out.println(animal1.toString());
        System.out.println(animal2.toString());
        System.out.println(animal3.toString());

        System.out.println("Animals speak:" );
        animal1.speak();
        animal2.speak();

        Predator p1 = (Predator) animal2;
        p1.hunt(animal3);

        Predator fudd = prey -> {
            System.out.println("Be vewwwy vewwy quiet!");
            prey.speak();
            prey.speak();
        };

        fudd.hunt(animal3);


        Object p5 = fudd;
    }
}
