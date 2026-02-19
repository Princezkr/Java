import java.util.Scanner;
class Employee{
    int id;
    String name;
    double salary;
    public void displayInfo(){
        System.out.println("Id: "+id);
        System.out.println("Name: "+name);
        System.out.println("Salary: "+salary);
    }
}
public class EmployeeClass1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Number Of Employees: ");
        int n=sc.nextInt();
        Employee[] emp=new Employee[n];
        for(int i=0; i<n; i++){
            System.out.println("Enter The Details Of Employee "+(i+1)+":");
            emp[i]=new Employee();
            System.out.print("Enter Id: ");
            emp[i].id=sc.nextInt();
            System.out.print("Enter Name: ");
            sc.nextLine();
            emp[i].name=sc.nextLine();
            System.out.print("Enter Salary: ");
            emp[i].salary=sc.nextDouble();
        }
        System.out.println("\nEmployee Details:");
        for(int i=0; i<n; i++){
            if(emp[i].salary>30000){
                emp[i].displayInfo();
            }
        }
    }
}
