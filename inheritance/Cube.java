package inheritance;

public class Cube extends Shape{
    public Cube(float length,float breadth,float height){
        super(length,breadth,height);
    }
    @Override
    public void area(){
        System.out.println("Area Of The Cube: "+(length*breadth*height));
    }
}