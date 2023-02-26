public class Sheep implements Animal {

    public Sheep() {

        System.out.println("Sheep is Made");

    }

    @Override
    public Animal makeCopy() {

        System.out.println("Sheep is Being Made");

        Sheep sheepObject = null;

        // Everytime an object needs to be cloned
        // it has to be wrapped in try-catch block
        try {
            // Calls the Animal super class clone()
            // Then casts the results to sheep
            sheepObject = (Sheep) super.clone();
        }
        // catch method is going to be triggered whenever
        // you try to clone an object that doesn't have
        // extends Cloneable on it
        catch(CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return sheepObject;

    }

    public String toString() {

        return "Dolly is my Hero, Baaa";

    }

}
