import java.util.Scanner;
public class EvenNumWithoutModulus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Number: ");
        int num=sc.nextInt();
        int i=num/2;
        float f=i/2;
        if(i==f){
            System.out.println("Its A Even Number");
        }
        else{
            System.out.println("Its A Odd Number");
        }
        sc.close();
    }
}
