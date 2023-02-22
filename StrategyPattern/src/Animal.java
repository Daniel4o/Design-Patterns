public class Animal {

    private String name;
    private double height;
    private int weight;
    private String favoriteFood;
    private double speed;
    private String sound;

    public Flyes flyingType;

    public void setName(String newName) {
        this.name = newName;
    }

    public void setHeight(double newHeight) { this.height = newHeight; }
    public void setWeight(int newWeight) {
        if(newWeight > 0) {
            this.weight = newWeight;
        } else {
            System.out.println("Weight must be bigger than 0");
        }
    }

    public void setFavoriteFood(String newFavoriteFood) { this.favoriteFood = newFavoriteFood; }

    public void setSpeed(double newSpeed) { this.speed = newSpeed; }

    public void setSound(String newSound) {
        this.sound = newSound;
    }

    public String getName() {
        return this.name;
    }

    public double getHeight() { return this.height; }

    public int getWeight() { return this.weight; }

    public String getFavoriteFood() {return this.favoriteFood; }

    public double getSpeed() { return this.speed; }

    public String getSound() {return this.sound; }

    public String tryToFly() {
        return flyingType.fly();
    }

    public void setFlyingAbility(Flyes newFlyType) {
        flyingType = newFlyType;
    }

}
