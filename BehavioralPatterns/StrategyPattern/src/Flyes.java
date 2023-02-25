public interface Flyes {
    String fly();
}

class ItFlyes implements  Flyes {
    public String fly() {
        return "Flying High";
    }
}

class ItCantFly implements  Flyes {
    public String fly() {
        return "I can't fly";
    }
}