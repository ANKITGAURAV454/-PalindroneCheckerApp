import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String palindrome;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Text: ");
        palindrome = sc.nextLine();
        String rev_palindrome;
        int count = 0;
        for (int i = 0; i < palindrome.length(); i++) {
            if (palindrome.charAt(i) == palindrome.charAt(palindrome.length() - i - 1)) {
                count++;
            }
        }

        boolean is_palindrome = false;
        if (count == palindrome.length()) {
            is_palindrome = true;
        }
        System.out.println("Is it a Palindrome? : "+is_palindrome);

    }
}
