import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main(String[] args) {

        String palindrome;
        Scanner sc = new Scanner(System.in);

        System.out.println("Input Text: ");
        palindrome = sc.nextLine();

        // Convert string to character array
        char[] characters = palindrome.toCharArray();

        int start = 0;
        int end = characters.length - 1;

        boolean is_palindrome = true;

        // Two-pointer technique
        while (start < end) {
            if (characters[start] != characters[end]) {
                is_palindrome = false;
                break;   // stop immediately if mismatch found
            }
            start++;
            end--;
        }

        System.out.println("Is it a Palindrome? : " + is_palindrome);

        sc.close();
    }
}
