public class ATMProxy implements GetATMData {

    @Override
    public ATMState getTMData() {
        ATMMachine realATMMachine = new ATMMachine();
        return realATMMachine.getTMData();
    }

    @Override
    public int getCashInMachine() {
        ATMMachine realATMMachine = new ATMMachine();
        return realATMMachine.getCashInMachine();
    }

}
