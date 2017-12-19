import java.util.Map;
import java.util.HashMap;

public class IsomorphicStrings {

    /**
     * This method determines whether two strings are isomorphic. Two strings
     * are isomorphic if the letters in one string can be remapped to get the
     * second string.
     *
     * <p>Time complexity: O(n) | Space complexity: O(n)
     *
     * @param str1 the 1st string
     * @param str2 the 2nd string
     * @return     whether or not the strings are isomorphic
     */
    public static boolean isIsomorphic(String input1, String input2) {
        if (input1 == null || input2 == null || input1.length() != input2.length()) {
            return false;
        }
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for (int i = 0; i < input1.length(); i++) {
            char c1 = input1.charAt(i);
            int value1 = map1.containsKey(c1) ? map1.get(c1)+1 : 1;
            map1.put(c1, value1);

            char c2 = input2.charAt(i);
            int value2 = map2.containsKey(c2) ? map2.get(c2)+1 : 1;
            map2.put(c2, value2);

            if (map1.get(c1) != map2.get(c2)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String[] strings1 = {
            "",
            "a",
            "add",
            "foo",
            "abcd",
            "abcabc",
            "abcabc"
        };
        String[] strings2 = {
            "",
            "b",
            "egg",
            "bar",
            "aabb",
            "xyzxyz",
            "xbexyz"
        };

        System.out.println("Isomorphic strings: ");
        for (int i = 0; i < strings1.length; i++) {
            System.out.print(strings1[i] + " <-> " + strings2[i] + " ? ");
            System.out.println(isIsomorphic(strings1[i], strings2[i]));
        }

    }
}
