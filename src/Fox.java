public class Fox extends Animal implements Predator {
  private int howFull = 0;

    public Fox(String name) {
        super(name);
    }

    @Override
    public void hunt(Animal a) throws EatingException {
        if(a instanceof Mouse) {
            throw new FoodAllergyException();
        }
        if(howFull > 3) {
            throw new StomachFullException();
        }
        a.speak();
        a.speak();
        System.out.println("yum!");
        howFull++;
    }

    @Override
    public void speak() {

    }
}
