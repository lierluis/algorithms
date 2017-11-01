public class ReverseString {

    /**
     * This function reverses a string literal.
     * <p>
     * Time complexity: O(n) | Space complexity: O(n)
     *
     * @param str the string literal
     * @return    the string str reversed
     */
    public static String reverseString(String str) {
        String inputString = str;
        String outputString = null;

        StringBuilder sb = new StringBuilder();

        if (inputString != null)
        {
            for (int i = inputString.length()-1; i >= 0; i--) {
                sb.append(inputString.charAt(i));
            }
            outputString = sb.toString();
        }
        return outputString;
    }

    public static void main(String[] args) {
        System.out.println(reverseString("abcd"));
        System.out.println(reverseString("a"));
        System.out.println(reverseString(""));
        System.out.println(reverseString(null));
    }
}
