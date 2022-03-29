public class AnimalTest {
    public static void main(String[] args)  {
        Animal animal1 = new Dog("Ada");
        Animal animal2 = new Fox("Swiper");
        Animal animal3 = new Mouse("Mickey");

        System.out.println("Animal Names: ");
        System.out.println(animal1.getName());
        System.out.println(animal2.getName());

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
