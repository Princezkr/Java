import java.util.Scanner;
public class Printer {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
        System.out.print("Enter a positive integer N: ");
        int N = sc.nextInt();
        
        for (int i = 1; i <= N; i++) {
            System.out.println(i);
        }
        sc.close();
    }
    }
}