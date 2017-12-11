public class SelectionSort {

    /**
     * This method sorts an array of integers using selection sort.
     *
     * <p>While selection sort has the same complexity as bubble sort, it
     * performs less swap operations, and is therefore more efficient.
     *
     * <p>Time complexity: O(n^2) | Space complexity: O(1)
     *
     * @param arr the array to be sorted
     * @return    arr sorted
     */
    public static int[] selectionSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return arr;
        }
        for (int i = 0; i < arr.length-1; i++) {
            int indexOfMin = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[indexOfMin]) {
                    indexOfMin = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[indexOfMin];
            arr[indexOfMin] = temp;
        }
        return arr;
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] arrays = {
            {4,12,4,78,7,-1},
            {4},
            {},
            {52,3,2}
        };

        for (int[] array : arrays) {
            System.out.print("Before: "); printArray(array);
            selectionSort(array);
            System.out.print("After: "); printArray(array);
            System.out.println();
        }
    }
}
