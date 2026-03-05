import java.util.Scanner;

public class PalindroneCheckerApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input text: ");
        String input = sc.nextLine();

        boolean isPalindrome = true;
        int j = 0;

        // Iterate from the last character to the first
        for (int i = input.length() - 1; i >= 0; i--) {
            if (input.charAt(i) != input.charAt(j)) {
                isPalindrome = false;
                break;
            }
            j++;
        }

        System.out.println("Is it a Palindrome? : " + isPalindrome);
        sc.close();
    }
}
