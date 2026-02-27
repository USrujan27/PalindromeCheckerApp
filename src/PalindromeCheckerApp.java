
import java.util.Stack;
public class PalindromeCheckerApp {

    public static void main(String[] args) {
        String str = "madam"; // Hardcoded string
        Stack<Character> stack = new Stack<>();
        boolean isPalindrome = true;

        // Push all characters onto the stack
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        // Compare characters by popping from stack
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != stack.pop()) {
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
