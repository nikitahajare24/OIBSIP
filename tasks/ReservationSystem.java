package tasks;

import java.util.Scanner;

public class ReservationSystem {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Initialize variables
        int totalSeats = 50;
        int bookedSeats = 0;
        
        while (true) {
            System.out.println("Welcome to the Online Reservation System!");
            System.out.println("1. Check available seats");
            System.out.println("2. Book a seat");
            System.out.println("3. Cancel a booking");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    int availableSeats = totalSeats - bookedSeats;
                    System.out.println("Available seats: " + availableSeats);
                    break;
                case 2:
                    if (bookedSeats < totalSeats) {
                        bookedSeats++;
                        System.out.println("Seat booked successfully!");
                    } else {
                        System.out.println("Sorry, no seats available.");
                    }
                    break;
                case 3:
                    if (bookedSeats > 0) {
                        bookedSeats--;
                        System.out.println("Booking cancelled successfully!");
                    } else {
                        System.out.println("No bookings to cancel.");
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using the Online Reservation System!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            
            System.out.println();
        }
    }
}
