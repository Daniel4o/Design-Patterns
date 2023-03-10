public abstract class EnemyShip {

    private String name;
    private double amountOfDamage;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmountOfDamage() {
        return amountOfDamage;
    }

    public void setAmountOfDamage(double amountOfDamage) {
        this.amountOfDamage = amountOfDamage;
    }

    public void followHeroShip() {
        System.out.println(getName() + " is following the hero.");
    }

    public void displayEnemyShip() {
        System.out.println(getName() + " is on the screen.");
    }
    public void enemyShipShoots() {
        System.out.println(getName() + " attacks and does " + getAmountOfDamage());
    }

}
