class Student{
    String name;
    int age;
    int roll;
    void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll: " +roll);
    }
}
public class ClassAndObject{
    public static void main(String[] args){
        Student Me=new Student();
        Me.name="Karmajoty Biswal";
        Me.age=19;
        Me.roll=534;
        Me.displayInfo();
    }
}
