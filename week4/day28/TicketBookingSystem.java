import java.util.Scanner;

public class TicketBookingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int availableSeats = 50;
        int choice;

        do {
            System.out.println("\n===== TICKET BOOKING SYSTEM =====");
            System.out.println("1. View Available Seats");
            System.out.println("2. Book Ticket");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Available Seats: " + availableSeats);
                    break;

                case 2:
                    System.out.print("Enter number of tickets to book: ");
                    int tickets = sc.nextInt();

                    if (tickets <= availableSeats) {
                        availableSeats -= tickets;
                        System.out.println(tickets + " ticket(s) booked successfully!");
                        System.out.println("Remaining Seats: " + availableSeats);
                    } else {
                        System.out.println("Sorry! Not enough seats available.");
                    }
                    break;

                case 3:
                    System.out.println("Thank you for using the Ticket Booking System!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 3);

        sc.close();
    }
}
