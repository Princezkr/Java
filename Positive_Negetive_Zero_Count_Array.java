import java.util.Scanner;
public class Positive_Negetive_Zero_Count_Array{
    public static void main(String[] args){
        int n,Positive=0,Negative=0,Zero=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Size Of The Array: ");
        n=sc.nextInt();
        int[] Arr=new int[n];
        for(int i=0; i<n; i++){
            System.out.print("Element "+(i+1)+": ");
            Arr[i]=sc.nextInt();
        }
        for(int i=0; i<n; i++){
            if(Arr[i]>0){
                Positive++;
            }
            else if(Arr[i]==0){
                Zero++;
            }
            else{
                Negative++;
            }
        }
        System.out.println("Total Positive Numbers Presnt In The Array: "+Positive);
        System.out.println("Total Positive Numbers Presnt In The Array: "+Zero);
        System.out.println("Total Positive Numbers Presnt In The Array: "+Negative);
        sc.close();
    }
}
