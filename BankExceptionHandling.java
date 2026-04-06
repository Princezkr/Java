class BankException extends Exception{
    BankException(String msg){
        super(msg);
    }
}
public class BankExceptionHandling{
    public static void main(String[] args) {
        int balance=5000;
        int withdrawl=6000;
        try{
            if(withdrawl>balance){
                throw new BankException("Insufficient Balance!");
            }
            else{
                System.out.println("Transaction Successfull!");
            }
        }
        catch(BankException e){
            System.out.println(e.getMessage());
        }
    }
}