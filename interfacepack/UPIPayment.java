package interfacepack;

public class UPIPayment implements Payment {
    @Override
    public void pay(double Amount) {
        System.out.println("Paid " + Amount + " using UPI");
    }
}
