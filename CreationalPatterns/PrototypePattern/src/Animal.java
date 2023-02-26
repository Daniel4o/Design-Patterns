
// By making this class Cloneable your application basically
// tells Java that copy instances of this class is allowed
// and those instance copies are going to be stored in
// completely different locations in memory
// So it's a copy but not a reference

public interface Animal extends Cloneable {

    public Animal makeCopy();

}
