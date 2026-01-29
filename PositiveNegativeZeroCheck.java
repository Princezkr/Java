import java.util.Scanner;
public class PositiveNegativeZeroCheck{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter A Number: ");
        int num=sc.nextInt();
        if(num>0){
            System.out.println("The Number "+num+" Is Positive");
        }
        else if(num==0){
            System.out.println("The Number "+num+" Is Zero");
        }
        else{
            System.out.println("The Number "+num+" Is Negative");
        }
        sc.close();
    }
}