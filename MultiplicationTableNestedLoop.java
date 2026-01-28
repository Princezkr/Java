import java.util.Scanner;
public class MultiplicationTableNestedLoop {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Number Of Tables: ");
        int n=sc.nextInt();
        for(int i=1; i<=n; i++){
            System.out.println("Table Of: "+i);
            for(int j=1; j<=10; j++){
                System.out.println(i+" * "+j+" = "+(i*j));
            }
            System.out.println();
        }
        sc.close();
    }
}
