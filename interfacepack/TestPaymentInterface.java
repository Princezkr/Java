package interfacepack;

public class TestPaymentInterface {
    public static void main(String[] args) {
        Payment payment = new UPIPayment();
        payment.pay(100.0);
        payment.displaypaymentDetails();
    }
}