public class ReplaceSpaces {

    /**
     * This method replaces all spaces in a string with a replacement string.
     * <p>
     * Time complexity: O(n) | Space complexity: O(n)
     *
     * @param a the string to iterate over
     * @param b the replacement string for the spaces in string a
     * @return  the string a with spaces replaced by string b
     */
    public static String replace(String a, String b) {
        if (a == null || b == null) {
            return a;
        }
        StringBuilder sb = new StringBuilder();
        for (char c : a.toCharArray()) {
            if (c == ' ') {
                sb.append(b);
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(replace("This is a test", "ABC"));
        System.out.println(replace("Replace all spaces", "ABC"));
        System.out.println(replace("This", "ABC"));
        System.out.println(replace("", "ABC"));
        System.out.println(replace(null, "ABC"));
    }
}
