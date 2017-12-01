import java.util.*;

public class UniqueNumber {

    /**
     * This method returns a number that occurs in an array exactly once.
     * <p>
     * Assumptions: the array will have a unique value and won't be empty.
     * <p>
     * Time complexity: O(n) | Space complexity: O(n)
     *
     * @param A the array
     * @return  the number that occurs exactly once in A
     */
    public static int singleNumber(int[] A) {
        Map<Integer, Integer> map = new HashMap<>();
        int result = 0;

        for (int key : A) {
            if (map.containsKey(key)) {
                map.put(key, map.get(key)+1);
            } else {
                map.put(key, 1);
            }
        }
        for (int key : map.keySet()) {
            if (map.get(key) == 1) {
                result = key;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(singleNumber(new int[] {1,2,3,4,1,2,4,3,5})); // 5
        System.out.println(singleNumber(new int[] {1})); // 1
        System.out.println(singleNumber(new int[] {1,1,1,4,5,6,7,7,6,4})); // 5
        System.out.println(singleNumber(new int[] {1,-1,1})); // -1
        System.out.println(singleNumber(new int[] {1,2,3,3,2,1,7,8,8})); // 7
    }
}
