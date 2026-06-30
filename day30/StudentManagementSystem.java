import java.util.Scanner;

public class StudentManagementSystem {

    static String[] names = new String[100];
    static int[] marks = new int[100];
    static int count = 0;

    // Add Student
    static void addStudent(Scanner sc) {
        System.out.print("Enter Student Name: ");
        names[count] = sc.nextLine();

        System.out.print("Enter Marks: ");
        marks[count] = sc.nextInt();
        sc.nextLine();

        count++;
        System.out.println("Student Added Successfully!");
    }

    // Display Students
    static void displayStudents() {
        if (count == 0) {
            System.out.println("No Records Found!");
            return;
        }

        System.out.println("\n===== STUDENT RECORDS =====");
        for (int i = 0; i < count; i++) {
            System.out.println("Name  : " + names[i]);
            System.out.println("Marks : " + marks[i]);
            System.out.println("------------------");
        }
    }

    // Search Student
    static void searchStudent(Scanner sc) {
        System.out.print("Enter Student Name to Search: ");
        String searchName = sc.nextLine();

        boolean found = false;

        for (int i = 0; i < count; i++) {
            if (names[i].equalsIgnoreCase(searchName)) {
                System.out.println("Student Found!");
                System.out.println("Name  : " + names[i]);
                System.out.println("Marks : " + marks[i]);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student Not Found!");
        }
    }

    // Calculate Average Marks
    static void averageMarks() {
        if (count == 0) {
            System.out.println("No Records Available!");
            return;
        }

        int sum = 0;

        for (int i = 0; i < count; i++) {
            sum += marks[i];
        }

        double avg = (double) sum / count;
        System.out.println("Average Marks = " + avg);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Calculate Average Marks");
            System.out.println("5. Exit");
            System.out.print("Enter Choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    addStudent(sc);
                    break;

                case 2:
                    displayStudents();
                    break;

                case 3:
                    searchStudent(sc);
                    break;

                case 4:
                    averageMarks();
                    break;

                case 5:
                    System.out.println("Program Ended.");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}
