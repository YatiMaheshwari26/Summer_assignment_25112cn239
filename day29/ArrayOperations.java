import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int choice;

        do {
            System.out.println("\n===== ARRAY OPERATIONS MENU =====");
            System.out.println("1. Display Array");
            System.out.println("2. Find Sum");
            System.out.println("3. Find Maximum Element");
            System.out.println("4. Find Minimum Element");
            System.out.println("5. Search Element");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Array Elements: ");
                    for (int num : arr) {
                        System.out.print(num + " ");
                    }
                    System.out.println();
                    break;

                case 2:
                    int sum = 0;
                    for (int num : arr) {
                        sum += num;
                    }
                    System.out.println("Sum = " + sum);
                    break;

                case 3:
                    int max = arr[0];
                    for (int num : arr) {
                        if (num > max) {
                            max = num;
                        }
                    }
                    System.out.println("Maximum Element = " + max);
                    break;

                case 4:
                    int min = arr[0];
                    for (int num : arr) {
                        if (num < min) {
                            min = num;
                        }
                    }
                    System.out.println("Minimum Element = " + min);
                    break;

                case 5:
                    System.out.print("Enter element to search: ");
                    int key = sc.nextInt();
                    boolean found = false;

                    for (int num : arr) {
                        if (num == key) {
                            found = true;
                            break;
                        }
                    }

                    if (found)
                        System.out.println("Element Found");
                    else
                        System.out.println("Element Not Found");
                    break;

                case 6:
                    System.out.println("Program Ended.");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 6);

        sc.close();
    }
}
