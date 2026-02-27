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

    // Method to measure execution time
    public static void testStrategy(String name, PalindromeStrategy strategy, String str) {
        PalindromeContext context = new PalindromeContext(strategy);

        long startTime = System.nanoTime();
        boolean result = context.checkPalindrome(str);
        long endTime = System.nanoTime();

        long duration = endTime - startTime;

        System.out.println(name + ": " + result + " | Time = " + duration + " ns");
    }

    public static void main(String[] args) {

        // Test string (longer string for better comparison)
        String str = "madamimadammadamimadammadamimadam";

        System.out.println("Performance Comparison:\n");

        testStrategy("Reverse Strategy", new ReverseStrategy(), str);
        testStrategy("Compare Strategy", new CompareStrategy(), str);
    }
}