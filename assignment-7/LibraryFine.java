import java.util.Scanner;

public class LibraryFine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of days late: ");
        int daysLate = scanner.nextInt();
        scanner.close();
        if (daysLate > 21) {
            System.out.println("Membership cancelled.");
        } else {
            double fine;
            if (daysLate <= 7) {
                fine = daysLate * 0.5; // 50 paise per day
            } else if (daysLate <= 14) {
                fine = 1.0; // Rs. 1 for days 8-14
            } else {
                fine = 5.0; // Rs. 5 for above 14 days
            }
            System.out.println("Fine: Rs. " + fine);
        }
    }
}