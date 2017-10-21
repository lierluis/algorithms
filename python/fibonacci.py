def iterative_fibonacci(position):
    """Find a position in the Fibonacci sequence iteratively.

    Time complexity: O(n)
    Space complexity: O(1)
    """
    if (position <= 1):
        return position
    first = 0
    second = 1
    next = first + second
    for i in range(2, position):
        first = second
        second = next
        next = first + second
    return next


def concise_fibonacci(position):
    """Find a Fibonacci position by using previous values in a growing list.

    Time complexity: O(n)
    Space complexity: O(n)
    """
    lst = []
    for i in range(position):
        lst.append(1 if i <= 1 else lst[i-1] + lst[i-2])
    return lst[position-1] if position > 0 else position


def memoized_fibonacci(position):
    """Find a position in the Fibonacci sequence using recursion & memoization.

    Time complexity: O(n)
    Space complexity: O(n)
    """
    memo = []
    for i in range(position + 1):
        memo.append(-1)

    def fib(position):
        """Perform logic of memoized_fibonacci()"""
        if position <= 1:
            return position
        if memo[position] > 0:
            return memo[position]
        memo[position] = fib(position-1) + fib(position-2)
        return memo[position]

    return fib(position)


def recursive_fibonacci(position):
    """Find a position in the Fibonacci sequence using naive recursion.

    Time complexity: O(2^n)
    Space complexity: O(n) memory
    """
    if position <= 1:
        return position
    return recursive_fibonacci(position-1) + recursive_fibonacci(position-2)

print("Finding 37th position in Fibonacci sequence...")
print("Concise:  ", concise_fibonacci(37))
print("Iterative:", iterative_fibonacci(37))
print("Memoized: ", memoized_fibonacci(37))
print("Recursive:", recursive_fibonacci(37))
