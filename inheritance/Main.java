package inheritance;
import java.util.Scanner;

public class Main {
    public static void message(){
        System.out.println("==================================================================================================");
        System.out.print("Enter 1 For Area\nEnter 2 For Perimeter\nEnter 3 For Both\n");
        System.out.println("==================================================================================================");
        System.out.print("Enter Your Choice: ");
    }
    public static void message1(){
        System.out.println("==================================================================================================");
        System.out.print("Enter 1 For Area\nEnter 2 For Circumference\nEnter 3 For Both\n");
        System.out.println("==================================================================================================");
        System.out.print("Enter Your Choice: ");
    }
    public static void message2(){
        System.out.println("==================================================================================================");
        System.out.print("Enter 1 For Area\n");
        System.out.println("==================================================================================================");
        System.out.print("Enter Your Choice: ");
    }
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        int loop=-1;
        float length,breadth,height;
        Scanner sc=new Scanner(System.in);
        while(loop!=0){
            System.out.println("==================================================================================================");
            System.out.printf("Enter 1 For Square\nEnter 2 For Rectangle\nEnter 3 For Circle\nEnter 4 Triangle\nEnter 5 For Cube\nEnter 0 To Exit\n");
            System.out.println("==================================================================================================");
            int choice,option;
            System.out.print("Enter Your Choice: ");
            choice=sc.nextInt();
            switch(choice){
                case 1 -> {
                    System.out.print("Enter The Length: ");
                    length=sc.nextFloat();
                    Shape Square=new Square(length);
                    message();
                    option=sc.nextInt();
                    switch(option){
                        case 1 -> Square.area();
                        case 2 -> Square.perimeter();
                        case 3 -> {
                            Square.area();
                            Square.perimeter();
                        }
                        default -> System.out.println("Invalid Option!\n");
                    }
                }
                case 2 -> {
                    System.out.print("Enter The Length: ");
                    length=sc.nextFloat();
                    System.out.print("Enter The Breadth: ");
                    breadth=sc.nextFloat();
                    Shape Rectangle=new Rectangle(length,breadth);
                    message();
                    option=sc.nextInt();
                    switch(option){
                        case 1 -> Rectangle.area();
                        case 2 -> Rectangle.perimeter();
                        case 3 -> {
                            Rectangle.area();
                            Rectangle.perimeter();
                    }
                        default -> System.out.println("Invalid Option!\n");
                    }
                }
                case 3 -> {
                    System.out.print("Enter The Radius: ");
                    length=sc.nextFloat();
                    Shape Circle=new Circle(length);
                    message1();
                    option=sc.nextInt();
                    switch(option){
                        case 1 -> Circle.area();
                        case 2 -> Circle.circumference();
                        case 3 -> {
                            Circle.area();
                            Circle.circumference();
                    }
                        default -> System.out.println("Invalid Option!\n");
                    }
                }
                case 4 -> {
                    System.out.print("Enter The Height: ");
                    height=sc.nextFloat();
                    System.out.print("Enter The Base: ");
                    breadth=sc.nextFloat();
                    Shape Triangel=new Triangle(height,breadth);
                    message2();
                    option=sc.nextInt();
                    switch(option){
                        case 1 -> Triangel.area();
                        default -> System.out.println("Invalid Option!\n");
                    }
                }
                case 5 -> {
                    System.out.print("Enter The Length: ");
                    length=sc.nextFloat();
                    System.out.print("Enter The Breadth: ");
                    breadth=sc.nextFloat();
                    System.out.print("Enter The Height: ");
                    height=sc.nextFloat();
                    Shape Cube=new Cube(length,breadth,height);
                    message2();
                    option=sc.nextInt();
                    switch(option){
                        case 1 -> Cube.area();
                        default -> System.out.println("Invalid Option!\n");
                    }
                }
                case 0 -> loop=0;
                default -> System.out.println("Invalid Input!\n");
            }
        }
        sc.close();
    }
}