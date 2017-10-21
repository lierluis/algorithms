def linear_search(input_list, value):
    """Search for a value in a list using linear/sequential search.

    Return index of value if found; -1 otherwise
    Time complexity: O(n)
    Space complexity: O(1)
    """
    for i in range(len(input_list)):
        if input_list[i] == value:
            return i
    return -1


def binary_search(input_list, value):
    """Search for a value in a list using binary search.

    Return index of value if found; -1 otherwise
    Time complexity: O(logn)
    Space complexity: O(1)
    """
    low = 0
    high = len(input_list)-1
    while low <= high:
        mid = (low+high)//2
        if input_list[mid] == value:
            return mid
        elif input_list[mid] < value:
            low = mid + 1
        elif input_list[mid] > value:
            high = mid - 1
    return -1


if __name__ == "__main__":
    test_list = [1,3,9,11,15,19,29]
    test_value1 = 25
    test_value2 = 15
    print("Linear search:", linear_search(test_list, test_value1))
    print("Linear search:", linear_search(test_list, test_value2))
    print("Binary search:", binary_search(test_list, test_value1))
    print("Binary search:", binary_search(test_list, test_value2))
