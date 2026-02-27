public class PalindromeCheckerApp {

    public static void main(String[] args) {
        String str = "madam"; // Hardcoded string

        char[] chars = str.toCharArray(); // Convert string to char array
        boolean isPalindrome = true;

        for (int i = 0; i < chars.length / 2; i++) {
            if (chars[i] != chars[chars.length - i - 1]) {
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
