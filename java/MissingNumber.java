public class MissingNumber {

    /**
     * This method finds a missing number from 1-10 in an array of 9 integers.
     *
     * <p>Time complexity: O(n) | Space complexity: O(1)
     *
     * @param arr the array of integers
     * @return    the missing integer in arr
     */
    public static int missingNumber(int[] arr) {
        int shouldBeSum = 10+9+8+7+6+5+4+3+2+1;
        int realSum = 0;
        for (int num : arr) {
            realSum += num;
        }
        return shouldBeSum - realSum;
    }

    public static void main(String[] args) {
        System.out.println(missingNumber(new int[] {1,2,3,4,5,6,7,8,10})); // 9
        System.out.println(missingNumber(new int[] {1,2,4,5,6,7,8,9,10})); // 3
        System.out.println(missingNumber(new int[] {6,7,8,9,10,1,2,4,5})); // 3
        System.out.println(missingNumber(new int[] {4,5,6,7,8,10,1,2,3})); // 9
    }
}
