import java.util.*;

public class PalindroneCheckerApp {

    public static boolean isPalindrome(String str) {
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        // Convert string to lowercase for uniform comparison
        str = str.toLowerCase();

        // Push and enqueue characters
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            stack.push(ch);
            queue.add(ch);
        }

        // Compare stack and queue elements
        while (!stack.isEmpty()) {
            if (stack.pop() != queue.remove()) {
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