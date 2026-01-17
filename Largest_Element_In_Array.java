import java.util.Scanner;
public class Largest_Element_In_Array{
    public static void main(String [] args){
        int n,Largest=0;
        System.out.print("Enter The Size Of Array: ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] Arr=new int[n];
        for(int i=0; i<n; i++){
            System.out.print("Element "+(i+1)+": ");
            Arr[i]=sc.nextInt();
            if(Largest<Arr[i]){
                Largest=Arr[i];
            }
        }
        System.out.println("The Largest Element Of The Array Is: "+Largest);
        sc.close();
    }
}