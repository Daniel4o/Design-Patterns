import java.util.ArrayList;

public class StockObserver implements Observer {

    private double ibmPrice;
    private double aaplPrice;
    private double googPrice;

    private ArrayList<Observer> observers;

    private static int observerIDTracker;

    private int observerID;

    private Subject stockGrabber;

    public StockObserver(Subject stockGrabber) {
        this.stockGrabber = stockGrabber;
        this.observerID = ++observerIDTracker;
        System.out.println("New Observer " + this.observerID);

        stockGrabber.register(this);
    }

    @Override
    public void update(double ibmPrice, double aaplPrice, double googPrice) {

        this.ibmPrice = ibmPrice;
        this.aaplPrice = aaplPrice;
        this.googPrice = googPrice;

        printThePrices();
    }
    public void printThePrices() {
        System.out.println(observerID + "\nIBM: " + ibmPrice + "\nAAPL: " +
                aaplPrice + "\nGOOG: " + googPrice + "\n");
        }

}
