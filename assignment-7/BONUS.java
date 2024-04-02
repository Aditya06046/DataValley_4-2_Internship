import java.util.Scanner;

public class BONUS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter current year: ");
        int currentYear = scanner.nextInt();

        System.out.print("Enter year employee joined: ");
        int joiningYear = scanner.nextInt();

        int yearsOfService = currentYear - joiningYear;
        scanner.close();
        if (yearsOfService > 5) {
            System.out.println("Bonus awarded: Rs. 5000");
        } else if (yearsOfService >= 3) {
            System.out.println("Bonus awarded: Rs. 3000");
        } else {
            System.out.println("No bonus awarded.");
        }
    }
}