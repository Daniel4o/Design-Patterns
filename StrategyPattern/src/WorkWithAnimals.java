public class WorkWithAnimals {

    public static void main(String[] args) {

        Dog fido = new Dog();

        fido.setName("Fido");
        System.out.println(fido.getName());

        fido.digHole();

        fido.setWeight(-1);

        // Objects on the other hand are passed by references
        changeObjectName(fido);

        System.out.println("Dog name after method call " + fido.getName() );

        // Polymorphism example
        Animal doggy = new Dog();
        Animal kitty = new Cat();

        System.out.println("Doggy says: " + doggy.getSound());
        System.out.println("Kitty says: " + kitty.getSound());

        Animal[] animals = new Animal[4];
        animals[0] = doggy;
        animals[1] = kitty;

        System.out.println("Doggy says: " + animals[0].getSound());
        System.out.println("Kitty says: " + animals[1].getSound());

        speakAnimal(doggy);

        // Although doggy is a Dog class and has a digHole() method
        // It is defined as type Animal class which doesn't have digHole()
        //doggy.digHole();
        // The solution is to cast it:
        // ((Dog)doggy).digHole();

    }

    public static void changeObjectName(Dog fido) {
        fido.setName("Marcus");
    }

    public static void speakAnimal(Animal randomAnimal) {
        System.out.println("Animal says: " + randomAnimal.getSound());
    }
}
