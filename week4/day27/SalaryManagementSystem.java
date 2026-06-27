import java.util.Scanner;

class Employee {
    int empId;
    String name;
    double basicSalary;

    Employee(int empId, String name, double basicSalary) {
        this.empId = empId;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    void calculateSalary() {
        double hra = basicSalary * 0.20;
        double da = basicSalary * 0.10;
        double netSalary = basicSalary + hra + da;

        System.out.println("\nEmployee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: ₹" + basicSalary);
        System.out.println("HRA: ₹" + hra);
        System.out.println("DA: ₹" + da);
        System.out.println("Net Salary: ₹" + netSalary);
        System.out.println("------------------------");
    }
}

public class SalaryManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();

        Employee[] employees = new Employee[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of Employee " + (i + 1));

            System.out.print("Employee ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Basic Salary: ");
            double salary = sc.nextDouble();

            employees[i] = new Employee(id, name, salary);
            sc.nextLine();
        }

        System.out.println("\nSalary Details:");
        for (Employee emp : employees) {
            emp.calculateSalary();
        }

        sc.close();
    }
}
