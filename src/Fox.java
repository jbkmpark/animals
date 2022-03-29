public class Fox extends Animal implements Predator {


    public Fox(String name) {
        super(name);
    }

    public void hunt(Animal a) {
        a.speak();
        a.speak();
        System.out.println("yum!");
    }

    public void speak() {

    }
}
