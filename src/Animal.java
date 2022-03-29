public abstract class Animal implements Comparable<Animal> {

    private  String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() { return name; }

    public abstract void speak();

    @Override
    public String toString() {
        return "ANIMAL: " + getName();
    }

    @Override
    public int compareTo(Animal animal) {
        return getName().compareTo(animal.getName());
    }
}
