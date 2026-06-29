import java.util.Scanner;

class Product {
    int id;
    String name;
    int quantity;

    Product(int id, String name, int quantity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }

    void display() {
        System.out.println("Product ID : " + id);
        System.out.println("Product Name : " + name);
        System.out.println("Quantity : " + quantity);
        System.out.println("---------------------");
    }
}

public class InventoryManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Product[] products = new Product[100];
        int count = 0;
        int choice;

        do {
            System.out.println("\n===== INVENTORY MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Product");
            System.out.println("2. Display Products");
            System.out.println("3. Search Product");
            System.out.println("4. Update Quantity");
            System.out.println("5. Exit");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Product ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Product Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Quantity: ");
                    int quantity = sc.nextInt();

                    products[count++] = new Product(id, name, quantity);
                    System.out.println("Product Added Successfully!");
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No Products Available!");
                    } else {
                        for (int i = 0; i < count; i++) {
                            products[i].display();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Product ID to Search: ");
                    int searchId = sc.nextInt();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (products[i].id == searchId) {
                            products[i].display();
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Product Not Found!");
                    }
                    break;

                case 4:
                    System.out.print("Enter Product ID: ");
                    int updateId = sc.nextInt();

                    System.out.print("Enter New Quantity: ");
                    int newQty = sc.nextInt();

                    boolean updated = false;

                    for (int i = 0; i < count; i++) {
                        if (products[i].id == updateId) {
                            products[i].quantity = newQty;
                            updated = true;
                            System.out.println("Quantity Updated Successfully!");
                            break;
                        }
                    }

                    if (!updated) {
                        System.out.println("Product Not Found!");
                    }
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
