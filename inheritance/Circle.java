package inheritance;

public class Circle extends Shape{
    public Circle(float radius){
        super(radius);
    }
    @Override
    public void area(){
        System.out.println("Area Of The Circle: "+(Math.PI*radius*radius));
    }
    @Override
    public void circumference(){
        System.out.println("Circumference Of The Circle: "+(2*Math.PI*radius*radius));
    }
}