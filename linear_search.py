def linear_search(array, value):
    """Search for a value in an array using linear/sequential search.

    Return index of value if found; -1 otherwise
    Time complexity: O(n)
    Space complexity: O(1)
    """
    for i in range(len(array)-1):
        if array[i] == value:
            return i
    return -1

array = [1,3,9,11,15,19,29]
value1 = 25
value2 = 15
print linear_search(array, value1)
print linear_search(array, value2)
