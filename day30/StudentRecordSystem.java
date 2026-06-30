import java.util.Scanner;

public class StudentRecordSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] names = new String[n];
        int[] marks = new int[n];

        // Input student details
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of Student " + (i + 1));

            System.out.print("Name: ");
            names[i] = sc.nextLine();

            System.out.print("Marks: ");
            marks[i] = sc.nextInt();
            sc.nextLine();
        }

        // Display student records
        System.out.println("\n===== STUDENT RECORDS =====");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1));
            System.out.println("Name  : " + names[i]);
            System.out.println("Marks : " + marks[i]);
            System.out.println("-------------------");
        }

        sc.close();
    }
}
