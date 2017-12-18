public class BubbleSort {

    /**
     * This method uses bubble sort to sort an array of integers.
     * <p>
     * Time complexity: O(n^2) | Space complexity: O(1)
     *
     * @param arr the array to be sorted
     * @return    arr sorted
     */
    public static int[] bubbleSort(int[] arr) {
        int length = arr.length;
        boolean swapped = true;
        while (swapped) {
            swapped = false;
            for (int i = 0; i < length-1; i++) {
                if (arr[i] > arr[i+1]) {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    swapped = true;
                }
            }
            length--;
        }
        return arr;
}

    public static void main(String[] args) {
        int[][] arrs = {
            {4,12,4,78,7,-1},
            {4},
            {},
            {52,3,2}
        };

        for (int[] arr : arrs) {
            System.out.println("Unsorted:");
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println("\nSorted:");
            for (int num : bubbleSort(arr)) {
                System.out.print(num + " ");
            }
            System.out.println("\n");
        }
    }
}
