package inheritance;

public class Shape {
    protected float length;
    protected float breadth;
    protected float height;
    protected float radius;
    
    protected Shape(float length,float breadth){
        this.length=this.height=length;
        this.breadth=breadth;
    }
    protected Shape(float radius){
        this.radius=this.length=radius;
    }
    protected Shape(float length,float breadth,float height){
        this.length=length;
        this.breadth=breadth;
        this.height=height;
    }
    public void area(){
        System.out.println("Find The Area Yourself!");
    }
    public void perimeter(){
        System.out.println("Find The Perimeter Yourself!");
    }
    public void circumference(){
        System.out.println("Find The Circumference Yourself!");
    }
}