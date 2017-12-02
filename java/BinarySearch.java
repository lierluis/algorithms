public class BinarySearch {

    /**
     * This method finds an integer n using binary search.
     *
     * <p>Time complexity: O(logn) | Space complexity: O(1)
     *
     * @param arr the array of integers
     * @param n   the integer to find in arr
     * @return    true if n is found in arr; false otherwise
     */
    public static boolean binarySearch(int[] arr, int n) {
        int low = 0;
        int high = arr.length - 1;
        while (high >= low) {
            int mid = (low + high) / 2;
            if (n == arr[mid]) {
                return true;
            } else if (n > arr[mid]) {
                low = mid + 1;
            } else if (n < arr[mid]) {
                high = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(binarySearch(new int[] {2,5,7,8,9,12}, 8)); // true
        System.out.println(binarySearch(new int[] {2}, 4)); // false
        System.out.println(binarySearch(new int[] {2}, 2)); // true
        System.out.println(binarySearch(new int[] {2,5,7,9,12}, 8)); // false
        System.out.println(binarySearch(new int[] {2,5,7,9,12}, 12)); // true
        System.out.println(binarySearch(new int[] {2,5,7,9,12}, 2)); // true
        System.out.println(binarySearch(new int[] {}, 4)); // false
    }
}
