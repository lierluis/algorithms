public class Palindrome {

    /**
     * This method checks whether a string is a palindrome. A palindrome is a
     * string that reads the same backward as forward.
     * <p>
     * Note: an empty string and a null value are considered palindromes.
     * <p>
     * Time complexity: O(n) | Space complexity: O(1)
     *
     * @param str the string to be checked for being a palindrome
     * @return    true if the string is a palindrome; false otherwise
     */
    public static boolean isStringPalindrome(String str) {
        if (str == null || str.length() <= 1) {
            return true;
        }
        int length = str.length();
        for (int i = 0; i < length/2; i++) {
            if (!(str.charAt(i) == str.charAt(length-1-i))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] tests = {"madam", "aabb", "race car", ""};
        for (String test : tests) {
            System.out.printf("\"%s\" is a palindrome? %b%n",
                    test, isStringPalindrome(test));
        }
        System.out.printf("null is a palindrome? %b%n", isStringPalindrome(null));
    }
}
