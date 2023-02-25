public class Dog extends Animal {

    public Dog() {
        super();
        setSound("Bark");

        // We set the Flyes Interface polymorphically
        // This sets the behaviour as a non-flying Animal
        flyingType = new ItCantFly();
    }

    public void digHole() {
        System.out.println("Dug a hole.");
    }


}
