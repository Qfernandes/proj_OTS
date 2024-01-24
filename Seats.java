import java.util.HashMap;
import java.util.Scanner;

public class Seats {
    private HashMap<Integer, Boolean> seatStatus;
    private int totalSeats;

    public Seats(int totalSeats) {
        this.totalSeats = totalSeats;
        initializeSeatStatus();
    }

    private void initializeSeatStatus() {
        seatStatus = new HashMap<>();
        for (int i = 1; i <= totalSeats; i++) {
            seatStatus.put(i, true);
        }
    }

    public void displayAvailableSeats() {
        System.out.println("Available Seats:");
        for (int seatNumber : seatStatus.keySet()) {
            if (seatStatus.get(seatNumber)) {
                System.out.print(seatNumber + " ");
            }
        }
        System.out.println();
    }
    
    public void bookSeats(int numSeats) {
        int bookedCount = 0;
        for (int seatNumber : seatStatus.keySet()) {
            if (seatStatus.get(seatNumber)) {
                seatStatus.put(seatNumber, false);
                bookedCount++;
            }
            if (bookedCount == numSeats) {
                break;
            }
        }

    }
    

    public void main(Scanner scanner) {
        int choice;
        do {
            System.out.println("1. View all the available seats");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    displayAvailableSeats();
                    break;
                case 0:
                    System.out.println("Quit");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalSeats = scanner.nextInt();
        Seats seat = new Seats(totalSeats);
        seat.main(scanner);
    }
}
