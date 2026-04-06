package inheritance;

public class Square extends Shape{
    public Square(float length){
        super(length);
    }
    @Override
    public void area(){
        System.out.println("Area Of The Square: "+(length*length));
    }
    @Override
    public void perimeter(){
        System.out.println("Perimeter Of The Square: "+(4*length));
    }
}