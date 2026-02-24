import java.util.Scanner;

public class PalindroneCheckerApp {

    static class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    public static boolean isPalindrome(Node head) {
        if (head == null || head.next == null) return true;

        Node slow = head;
        Node fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node secondHalf = reverseList(slow.next);

        Node firstHalf = head;
        Node second = secondHalf;
        boolean isPalindrome = true;
        while (second != null) {
            if (firstHalf.data != second.data) {
                isPalindrome = false;
                break;
            }
            firstHalf = firstHalf.next;
            second = second.next;
        }

        slow.next = reverseList(secondHalf);
        return isPalindrome;
    }

    private static Node reverseList(Node head) {
        Node prev = null;
        Node curr = head;
        while (curr != null) {
            Node nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }

    private static Node stringToLinkedList(String input) {
        if (input.isEmpty()) return null;
        Node head = new Node(input.charAt(0));
        Node current = head;
        for (int i = 1; i < input.length(); i++) {
            current.next = new Node(input.charAt(i));
            current = current.next;
        }
        return head;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input: ");
        String input = sc.nextLine();

        input = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        Node head = stringToLinkedList(input);

        boolean result = isPalindrome(head);

        System.out.println("Is it a Palindrome? : " + result);

        sc.close();
    }
}