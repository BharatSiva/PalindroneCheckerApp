import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class PalindroneCheckerApp {

    public static boolean isPalindrome(String input) {

        // Create a Deque
        Deque<Character> deque = new LinkedList<>();

        // Convert to lowercase for case-insensitive comparison
        input = input.toLowerCase();

        // Insert characters into deque
        for (char ch : input.toCharArray()) {
            deque.addLast(ch);
        }

        // Compare front and rear elements
        while (deque.size() > 1) {
            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if (front != rear) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("The string is a Palindrome.");
        } else {
            System.out.println("The string is NOT a Palindrome.");
        }

        scanner.close();
    }
}