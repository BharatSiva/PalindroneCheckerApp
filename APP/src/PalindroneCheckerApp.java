import java.util.Scanner;

public class PalindromeChecker {

    // Recursive method to check palindrome
    public static boolean isPalindrome(String str, int start, int end) {

        // Base condition: if pointers cross or are equal
        if (start >= end) {
            return true;
        }

        // If characters at start and end are not equal
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recursive call with next indices
        return isPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Convert to lowercase and remove spaces (optional improvement)
        String processed = input.replaceAll("\\s+", "").toLowerCase();

        // Call recursive function
        boolean result = isPalindrome(processed, 0, processed.length() - 1);

        if (result) {
            System.out.println("The given string is a Palindrome.");
        } else {
            System.out.println("The given string is NOT a Palindrome.");
        }

        scanner.close();
    }
}