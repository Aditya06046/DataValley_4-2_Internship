import java.util.Scanner;

public class vowelcount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine().toLowerCase(); // Convert to lowercase for case-insensitive check

        int vowelCount = 0;
        boolean hasVowels = false;

        for (char character : inputString.toCharArray()) {
            if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
                vowelCount++;
                hasVowels = true;
            }
        }
        scanner.close();

        if (hasVowels) {
            System.out.println("Vowels present: Yes");
            System.out.println("Number of vowels: " + vowelCount);
        } else {
            System.out.println("Vowels present: No");
        }
    }
}