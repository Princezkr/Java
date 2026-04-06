package inheritance;

public class Rectangle extends Shape{
    public Rectangle(float length,float breadth){
        super(length,breadth);
    }
    @Override
    public void area(){
        System.out.println("Area Of The Rectangle: "+(length*breadth));
    }
    @Override
    public void perimeter(){
        System.out.println("Perimeter Of The Rectangle: "+(2*(length+breadth)));
    }
}