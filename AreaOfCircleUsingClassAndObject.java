import java.util.Scanner;
class Circle{
    float radius;
    double area;
    double circumference;
    double PI=java.lang.Math.PI;
    Circle(float radius){
        this.radius=radius;
    }
    void displayArea(){
        area=java.lang.Math.PI*radius*radius;
        System.out.println("The Area Of Circle: "+area);
    }
    void displayCircumference(){
        circumference=2*PI*radius;
        System.out.println("The Circumference Of Circle: "+circumference);
    }
}
public class AreaOfCircleUsingClassAndObject {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Radius Of Cirlce: ");
        float radius=sc.nextFloat();
        Circle c1=new Circle(radius);
        c1.displayArea();
        c1.displayCircumference();
        sc.close();
    }
}
