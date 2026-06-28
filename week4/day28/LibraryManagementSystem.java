import java.util.Scanner;

class Book {
    int bookId;
    String title;
    boolean issued;

    Book(int bookId, String title) {
        this.bookId = bookId;
        this.title = title;
        this.issued = false;
    }

    void display() {
        System.out.println("Book ID : " + bookId);
        System.out.println("Title   : " + title);
        System.out.println("Status  : " + (issued ? "Issued" : "Available"));
        System.out.println("---------------------");
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Book[] books = {
                new Book(101, "Java Programming"),
                new Book(102, "Data Structures"),
                new Book(103, "Operating Systems")
        };

        int choice;

        do {
            System.out.println("\n===== LIBRARY MENU =====");
            System.out.println("1. Display Books");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. Exit");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    for (Book b : books) {
                        b.display();
                    }
                    break;

                case 2:
                    System.out.print("Enter Book ID to Issue: ");
                    int issueId = sc.nextInt();

                    for (Book b : books) {
                        if (b.bookId == issueId) {
                            if (!b.issued) {
                                b.issued = true;
                                System.out.println("Book Issued Successfully!");
                            } else {
                                System.out.println("Book Already Issued!");
                            }
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Book ID to Return: ");
                    int returnId = sc.nextInt();

                    for (Book b : books) {
                        if (b.bookId == returnId) {
                            if (b.issued) {
                                b.issued = false;
                                System.out.println("Book Returned Successfully!");
                            } else {
                                System.out.println("Book Was Not Issued!");
                            }
                        }
                    }
                    break;

                case 4:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}
