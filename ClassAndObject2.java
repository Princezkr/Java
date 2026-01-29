class Student{
    String name;
    int age;
    int roll;
    String course;
    Student(String name, int age, int roll, String course){
        this.name=name;
        this.age=age;
        this.roll=roll;
        this.course=course;
    }
    public void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll: " +roll);
        System.out.println("Course: " +course);
    }
}
public class ClassAndObject2{
    public static void main(String[] args){
        Student s1=new Student("Karmajoty Biswal",19,534,"Computer Science");
        s1.displayInfo(); 
    }
}