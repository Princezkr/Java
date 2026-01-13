//Java Program to Find Years Having Leap Year After 8 Years
import java.util.Scanner;
public class YearsHavingLeapYearAfter_8_Years{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Starting Year: ");
        int Start_Year=sc.nextInt();
        System.out.print("Enter The Ending Year: ");
        int End_Year=sc.nextInt();
        System.out.println("The Years Having Leap Year After 8 Years Are:");
        for(int i=Start_Year; i<=End_Year; i++){
            if(i%4==0 && i%100==0 && i%400!=0){
                System.out.println((i-4) + " And " + (i+4));
            }
        }
        sc.close();
    }
}