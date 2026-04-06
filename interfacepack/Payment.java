package interfacepack;

public interface Payment {
    void pay(double Amount);
    default void displaypaymentDetails(){
        System.out.println("Payment details");
    }
}