public class PalindromeCheckerApp {

    // Strategy Interface
    interface PalindromeStrategy {
        boolean isPalindrome(String str);
    }

    // Reverse Strategy
    static class ReverseStrategy implements PalindromeStrategy {
        public boolean isPalindrome(String str) {
            String reversed = new StringBuilder(str).reverse().toString();
            return str.equals(reversed);
        }
    }

    // Character Compare Strategy
    static class CompareStrategy implements PalindromeStrategy {
        public boolean isPalindrome(String str) {
            int left = 0;
            int right = str.length() - 1;

            while (left < right) {
                if (str.charAt(left) != str.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }
            return true;
        }
    }

    // Context Class
    static class PalindromeContext {
        private PalindromeStrategy strategy;

        public PalindromeContext(PalindromeStrategy strategy) {
            this.strategy = strategy;
        }

        public void setStrategy(PalindromeStrategy strategy) {
            this.strategy = strategy;
        }

        public boolean checkPalindrome(String str) {
            return strategy.isPalindrome(str);
        }
    }

    // Main Method
    public static void main(String[] args) {
        String str = "madam"; // Hardcoded string

        PalindromeContext context = new PalindromeContext(new ReverseStrategy());
        System.out.println("Using Reverse Strategy: " + context.checkPalindrome(str));

        context.setStrategy(new CompareStrategy());
        System.out.println("Using Compare Strategy: " + context.checkPalindrome(str));
    }
}