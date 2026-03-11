import java.util.Scanner;

public class PalindroneCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string to check palindrome:");
        String input = sc.nextLine();

        // Step 1: Normalize the string
        // Remove spaces using regular expression and convert to lowercase
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        // Step 2: Check palindrome
        boolean isPalindrome = true;
        int left = 0;
        int right = normalized.length() - 1;

        while (left < right) {
            if (normalized.charAt(left) != normalized.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        // Step 3: Print result
        if (isPalindrome) {
            System.out.println("The given string is a palindrome (ignoring spaces and case).");
        } else {
            System.out.println("The given string is NOT a palindrome.");
        }

        sc.close();
    }
}