import java.util.Scanner;
public class FactorialNestedLoop {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("Enter How Many Factorials To Find: ");
        n=sc.nextInt();
        for(int i=1; i<=n; i++){
            int fact=1;
            for(int j=1; j<=i; j++){
                fact*=j;
            }
            System.out.println("Factorial Of "+i+": "+fact);
        }
        sc.close();
    }
}
