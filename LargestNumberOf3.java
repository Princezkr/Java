import java.util.Scanner;
public class LargestNumberOf3 {
    public static void main(String[] args){
        int first,second,third;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The First Number: ");
        first=sc.nextInt();
        System.out.print("Enter The Second Number: ");
        second=sc.nextInt();
        System.out.print("Enter The Third Number: ");
        third=sc.nextInt();
        if(first>second && first>third){
            System.out.println("The First Number "+first+" Is Greater ");
        }
        else if(second>third){
            System.out.println(("The Second Number "+second+" Is Greater"));
        }
        else{
            System.out.println(("The Third Number "+third+" Is Greater"));
        }
        sc.close();
    }
}