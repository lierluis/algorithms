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
        int[] arr = {4,12,4,78,7,-1};
        int[] arr2 = {4};
        int[] arr3 = {};
        int[] arr4 = {52,3,2};

        System.out.println("\narr: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        for (int num : bubbleSort(arr)) {
            System.out.print(num + " ");
        }
        System.out.println("\narr2:");
        for (int num : arr2) {
            System.out.print(num + " ");
        }
        System.out.println();
        for (int num : bubbleSort(arr2)) {
            System.out.print(num + " ");
        }
        System.out.println("\narr3:");
        for (int num : arr3) {
            System.out.print(num + " ");
        }
        System.out.println();
        for (int num : bubbleSort(arr3)) {
            System.out.print(num + " ");
        }
        System.out.println("\narr4:");
        for (int num : arr4) {
            System.out.print(num + " ");
        }
        System.out.println();
        for (int num : bubbleSort(arr4)) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
