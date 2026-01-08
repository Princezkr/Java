import java.util.Scanner;
public class Factorial{
    public static void main(String[] args){
        Scanner Scanner=new Scanner(System.in);
        System.out.print("Enter a positive integer N: ");
        int N=Scanner.nextInt();
        int Factorial=1;
        for(int i=1;i<=N;i++){
            Factorial=Factorial*i;
        }
        System.out.println("Factorial Of "+N+" is " + Factorial);
        Scanner.close();
    }
}