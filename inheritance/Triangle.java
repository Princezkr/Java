package inheritance;

public class Triangle extends Shape{
    public Triangle(float height,float base){
        super(height,base);
    }
    @Override
    public void area(){
        System.out.println("Area Of The Triangle: "+(breadth*height)/2);
    }
}