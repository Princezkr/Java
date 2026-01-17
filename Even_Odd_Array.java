import java.util.Scanner;
public class Even_Odd_Array{
    public static void main(String [] args){
        int n,Even=0,Odd=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Size Of The Array: ");
        n=sc.nextInt();
        int[] Arr=new int[n];
        for(int i=0; i<n; i++){
            System.out.print("Element "+(i+1)+": ");
            Arr[i]=sc.nextInt();
            if(Arr[i]%2==0){
                Even++;
            }
            else{
                Odd++;
            }
        }
        System.out.println("Total Number Of Odd Numbers Presnt In The Array Is: "+Odd);
        System.out.print("Total Number Of Even Numbers Presnt In The Array Is: "+Even);
        sc.close();
    }
}
