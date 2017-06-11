def binary_search(array, value):
    """Search for a value in an array using binary search.

    Return index of value if found; -1 otherwise
    Time complexity: O(logn)
    Space complexity: O(1)
    """
    low = 0
    high = len(array)-1
    while low <= high:
        mid = (low+high)/2
        if array[mid] == value:
            return mid
        elif array[mid] < value:
            low = mid + 1
        elif array[mid] > value:
            high = mid - 1
    return -1

array = [1,3,9,11,15,19,29]
value1 = 25
value2 = 15
print binary_search(array, value1)
print binary_search(array, value2)
