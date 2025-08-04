import java.util.Scanner;

public class EvenOddChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner to take input

        System.out.print("Enter a number: ");
        int number = scanner.nextInt(); // Read input number

        // Control statement to check parity
        if (number % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }

        scanner.close(); // Close the scanner
    }
}