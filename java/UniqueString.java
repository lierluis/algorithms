import java.util.*;

public class UniqueString {

    /**
     * This method checks if all ASCII characters in a string are unique.
     * <p>
     * We use a boolean array of size 256 to represent the 256 possibilities
     * for 8-bit characters in Java (2^8 = 256)
     * <p>
     * Time complexity: O(n) | Space complexity: O(1)
     *
     * @param str the string to check
     * @return    true if the chars in the string are unique; false otherwise
     */
    public static boolean uniqueStringASCII(String str) {
        if (str == null || str.length() <= 1) {
            return true;
        }
        boolean[] chars = new boolean[256];
        for (int i = 0; i < str.length(); i++) {
            int pos = str.charAt(i);
            if (chars[pos] == true) {
                return false;
            }
            chars[pos] = true;
        }
        return true;
    }

    /**
     * This method checks if all characters in a string are unique.
     * <p>
     * Time complexity: O(n) | Space complexity: O(n)
     *
     * @param str the string to check
     * @return    true if the chars in the string are unique; false otherwise
     */
    public static boolean uniqueString(String str) {
        if (str == null || str.length() <= 1) {
            return true;
        }
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            if(!set.add(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("ASCII characters");
        System.out.println("\"123!@\": " + uniqueStringASCII("123!@"));
        System.out.println("\"Not unique\": " + uniqueStringASCII("Not unique"));
        System.out.println("\"A\": " + uniqueStringASCII("A"));
        System.out.println("\"\": " + uniqueStringASCII(""));
        System.out.println("null: " + uniqueStringASCII(null) + "\n");

        System.out.println("Any characters: ");
        System.out.println("\"123!@\": " + uniqueString("123!@"));
        System.out.println("\"Not unique\": " + uniqueString("Not unique"));
        System.out.println("\"A\": " + uniqueString("A"));
        System.out.println("\"\": " + uniqueString(""));
        System.out.println("null: " + uniqueString(null));
    }
}
