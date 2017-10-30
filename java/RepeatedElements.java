import java.util.*;

public class RepeatedElements {
    /**
     * Tihs method checks for duplicate numbers in an array.
     * <p>
     * Time complexity: O(nlogn) | Space complexity: O(n)
     * <p>
     *
     * @param numbers the array of numbers to search through
     * @return        the string representation of duplicate elements in the array
     */
    public static String duplicate(int[] numbers) {
        Set<Integer> repeatedNumbers = new TreeSet<>();
        Arrays.sort(numbers); // O(nlogn)

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == numbers[i-1]) {
                repeatedNumbers.add(numbers[i]); // O(logn)
            }
        }
        return repeatedNumbers.toString();
    }

    public static void main(String[] args) {
        int[] arr = {1,4,3,2,1};
        int[] arr2 = {1,3,4,2,1,2,4};

        System.out.print("Array 1: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println("\nDuplicate elements: " + duplicate(arr));

        System.out.print("Array 2: ");
        for (int num : arr2) {
            System.out.print(num + " ");
        }
        System.out.println("\nDuplicate elements: " + duplicate(arr2));
    }
}
