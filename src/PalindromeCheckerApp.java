import java.util.ArrayDeque;
import java.util.Deque;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String str = "madam"; // Hardcoded string

        Deque<Character> deque = new ArrayDeque<>();
        boolean isPalindrome = true;

        // Add all characters to the deque
        for (char ch : str.toCharArray()) {
            deque.addLast(ch);
        }

        // Compare characters from both ends
        while (deque.size() > 1) {
            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if (front != rear) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("The string \"" + str + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + str + "\" is not a palindrome.");
        }
    }
}