import java.util.LinkedList;
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String str = "madam"; // Hardcoded string

        LinkedList<Character> list = new LinkedList<>();
        boolean isPalindrome = true;

        // Add characters to the linked list
        for (char ch : str.toCharArray()) {
            list.add(ch);
        }

        // Compare characters from both ends
        while (list.size() > 1) {
            char first = list.removeFirst();
            char last = list.removeLast();

            if (first != last) {
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