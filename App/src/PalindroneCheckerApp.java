import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            queue.add(ch);   // enqueue (FIFO)
            stack.push(ch);  // push (LIFO)
        }

        boolean isPalindrome = true;

        while (!queue.isEmpty()) {
            char fromQueue = queue.remove();
            char fromStack = stack.pop();
            if (fromQueue != fromStack) {
                isPalindrome = false;
                break; // stop immediately if mismatch
            }
        }

        System.out.println("Is it a Palindrome? : " + isPalindrome);

        sc.close();
    }
}