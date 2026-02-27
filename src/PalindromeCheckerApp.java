public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String str = "A man a plan a canal Panama"; // Hardcoded string

        // Remove spaces and convert to lowercase
        String cleaned = str.replaceAll("\\s+", "").toLowerCase();

        boolean isPalindrome = true;
        int left = 0;
        int right = cleaned.length() - 1;

        // Compare characters
        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        if (isPalindrome) {
            System.out.println("\"" + str + "\" is a palindrome (ignoring case and spaces).");
        } else {
            System.out.println("\"" + str + "\" is not a palindrome.");
        }
    }
}