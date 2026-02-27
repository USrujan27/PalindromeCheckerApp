import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String str = "madam"; // Hardcoded string

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        boolean isPalindrome = true;

        // Add characters to both queue and stack
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            queue.add(ch);   // FIFO order
            stack.push(ch);  // LIFO order
        }

        // Compare elements from queue and stack
        while (!queue.isEmpty()) {
            if (queue.remove() != stack.pop()) {
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