import java.util.Scanner;

public class MiniLibrarySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of books: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] books = new String[n];

        // Add books
        for (int i = 0; i < n; i++) {
            System.out.print("Enter title of Book " + (i + 1) + ": ");
            books[i] = sc.nextLine();
        }

        int choice;

        do {
            System.out.println("\n===== MINI LIBRARY SYSTEM =====");
            System.out.println("1. Display Books");
            System.out.println("2. Search Book");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("\nAvailable Books:");
                    for (String book : books) {
                        System.out.println(book);
                    }
                    break;

                case 2:
                    System.out.print("Enter book title to search: ");
                    String searchBook = sc.nextLine();

                    boolean found = false;

                    for (String book : books) {
                        if (book.equalsIgnoreCase(searchBook)) {
                            found = true;
                            break;
                        }
                    }

                    if (found)
                        System.out.println("Book Found!");
                    else
                        System.out.println("Book Not Found!");

                    break;

                case 3:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 3);

        sc.close();
    }
}
