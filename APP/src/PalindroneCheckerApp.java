import java.util.Scanner;

// PalindromeChecker class encapsulating palindrome logic
class PalindromeChecker {

    // Method to check palindrome
    public boolean checkPalindrome(String input) {

        // Preprocess the string
        input = input.replaceAll("\\s+", "").toLowerCase();

        // Convert string to character array
        char[] arr = input.toCharArray();

        int start = 0;
        int end = arr.length - 1;

        // Compare characters from start and end
        while (start < end) {
            if (arr[start] != arr[end]) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}

// Main class
public class PalindroneCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Create object of PalindromeChecker
        PalindromeChecker checker = new PalindromeChecker();

        // Call method
        boolean result = checker.checkPalindrome(input);

        if (result) {
            System.out.println("The given string is a Palindrome.");
        } else {
            System.out.println("The given string is NOT a Palindrome.");
        }

        scanner.close();
    }
}