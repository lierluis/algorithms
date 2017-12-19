import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatedCharacter {

    /**
     * This method finds the first non-repeated character in a string.
     *
     * <p>Time complexity: O(n) | Space complexity: O(n)
     *
     * @param str the string to check
     * @return    the first non-repeated character in the string; null otherwise
     */
    public static Character firstNonRepeatedCharacter(String str) {
        if (str == null || str.length() < 1) {
            return null;
        }
        Map<Character, Integer> map = new HashMap<>();
        for (char c : str.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c)+1);
            } else {
                map.put(c, 1);
            }
        }
        for (char key : map.keySet()) {
            if (map.get(key) == 1) {
                return key;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        String[] strings = {
            "abcdcd", // a
            "aabcdc", // b
            "aaaa", // null
            "b" // b
        };
        for (String str : strings) {
            System.out.println(firstNonRepeatedCharacter(str));
        }
    }
}
