import java.util.Scanner;

class Employee {
    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void displayInfo() {
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

public class EmployeeClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number Of Employees: ");
        int n = sc.nextInt();
        Employee[] emp = new Employee[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter Details Of Employee: " + (i + 1));
            System.out.print("Enter Id: ");
            int id = sc.nextInt();
            System.out.print("Enter Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Enter Salary: ");
            double salary = sc.nextDouble();
            emp[i] = new Employee(id, name, salary);
        }
        System.out.println("Employees Having Salary More Than 30000 Are: ");
        for (int i = 0; i < n; i++) {
            if (emp[i].salary > 30000) {
                emp[i].displayInfo();
            }
        }
        sc.close();
    }
}