import java.util.Scanner;
public class Num_Rev {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive integer N: ");
        int N=sc.nextInt();
        int reversed=0;
        while(N>0){
            int Rem=N%10;
            reversed=reversed*10+Rem;
            N=N/10;
        }
        System.out.println("Reversed Number Is:" + reversed);
        sc.close();
    }
}
