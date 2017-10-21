public class Search {

    public static int binarySearch(int[] arr, int value) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == value) {
                return mid;
            } else if (arr[mid] > value) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,9,11,15,19,29};
        int value1 = 15;
        int value2 = 25;

        System.out.print("Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.printf("%nIndex of %d is %d%n",
                value1, binarySearch(arr, value1));
        System.out.printf("Index of %d is %d%n",
                value2, binarySearch(arr, value2));
    }
}
