import java.util.*;
public class Array_Sum{
    public static void main(String[] args){
        int n;
        System.out.print("Enter The Size Of Array: ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] Arr=new int[n];
        System.out.println("Enter The Elements To Add Into Array: ");
        for(int i=0; i<n; i++){
            System.out.print("Element "+(i+1)+": ");
            Arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0; i<n; i++){
            sum+=Arr[i];
        }
        System.out.print("Sum Of All Elements Of The Array Is: "+sum);
        sc.close();
    }
}
