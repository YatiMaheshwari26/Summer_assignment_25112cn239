import java.util.Scanner;

public class MiniEmployeeManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        int[] empId = new int[n];
        String[] empName = new String[n];
        double[] empSalary = new double[n];

        sc.nextLine();

        // Input employee details
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of Employee " + (i + 1));

            System.out.print("Employee ID: ");
            empId[i] = sc.nextInt();
            sc.nextLine();

            System.out.print("Employee Name: ");
            empName[i] = sc.nextLine();

            System.out.print("Employee Salary: ");
            empSalary[i] = sc.nextDouble();
        }

        int choice;

        do {
            System.out.println("\n===== EMPLOYEE MANAGEMENT SYSTEM =====");
            System.out.println("1. Display Employees");
            System.out.println("2. Search Employee");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\nEmployee Records:");
                    for (int i = 0; i < n; i++) {
                        System.out.println("ID: " + empId[i]);
                        System.out.println("Name: " + empName[i]);
                        System.out.println("Salary: ₹" + empSalary[i]);
                        System.out.println("-------------------");
                    }
                    break;

                case 2:
                    System.out.print("Enter Employee ID to search: ");
                    int searchId = sc.nextInt();

                    boolean found = false;

                    for (int i = 0; i < n; i++) {
                        if (empId[i] == searchId) {
                            System.out.println("Employee Found:");
                            System.out.println("ID: " + empId[i]);
                            System.out.println("Name: " + empName[i]);
                            System.out.println("Salary: ₹" + empSalary[i]);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Employee Not Found!");
                    }
                    break;

                case 3:
                    System.out.println("Program Ended.");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 3);

        sc.close();
    }
}
