public class PalindromeCheckerApp {

    // Recursive method to check palindrome
    public static boolean isPalindrome(String str, int left, int right) {
        // Base case: if pointers cross or meet
        if (left >= right) {
            return true;
        }

        // If characters don't match, not a palindrome
        if (str.charAt(left) != str.charAt(right)) {
            return false;
        }

        // Recursive call with next inner characters
        return isPalindrome(str, left + 1, right - 1);
    }

    public static void main(String[] args) {
        String str = "madam"; // Hardcoded string

        if (isPalindrome(str, 0, str.length() - 1)) {
            System.out.println("The string \"" + str + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + str + "\" is not a palindrome.");
        }
    }
}
