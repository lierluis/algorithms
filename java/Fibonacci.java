public class Fibonacci {

    /**
     * This method recursively finds the nth number in the fibonacci sequence.
     * <p>
     * Time complexity: O(n^2) | Space complexity: O(n) memory
     *
     * @param n the index in the fibonacci sequence
     * @return  the nth number in the fibonacci sequence
     */
    public static int fib(int n) {
        return (n < 2) ? n : fib(n-1) + fib(n-2);
    }

    public static void main(String[] args) {
        System.out.println(fib(-1));
        System.out.println(fib(0));
        System.out.println(fib(1));
        System.out.println(fib(10));
    }
}
