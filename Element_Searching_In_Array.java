import java.util.Scanner;
public class Element_Searching_In_Array{
    public static void main(String [] args){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Size Of The Array: ");
        n=sc.nextInt();
        int[] Arr=new int[n];
        for(int i=0; i<n; i++){
            System.out.print("Element "+(i+1)+": ");
            Arr[i]=sc.nextInt();
        }
        int Target;
        boolean Condition=true;
        System.out.print("Enter The Element To Search In The Array: ");
        Target=sc.nextInt();
        for(int i=0; i<n; i++){
            if(Arr[i]==Target){
                System.out.print("The Target Element " +Target+" Is Found In The Array");
                Condition=false;
            }
        }
        if(Condition){
            System.out.print("The Target Element "+Target+" Is Not Found In The Array");
        }
        sc.close();
    }
}