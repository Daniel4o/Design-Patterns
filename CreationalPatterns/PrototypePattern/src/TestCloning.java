public class TestCloning {

    public static void main(String[] args) {

        // Handles routing makeCopy method calls to the
        // right subclasses of Animal

        CloneFactory animalMaker = new CloneFactory();

        Sheep sally = new Sheep();

        // Creates a clone of Sally and stores it
        // in its own memory location

        Sheep cloneSheep = (Sheep) animalMaker.getClone(sally);

        // Exact copies of each other

        System.out.println(sally);

        System.out.println(cloneSheep);

        // Their hashcode is different.
        // They are located in a different part of memory.

        System.out.println("Sally Hashcode: " + System.identityHashCode(System.identityHashCode(sally)));

        System.out.println("Clone Hashcode: " + System.identityHashCode(System.identityHashCode(cloneSheep)));

    }

}
