def linear_search(input_list, value):
    """Search for a value in a list using linear/sequential search.

    Return index of value if found; -1 otherwise
    Time complexity: O(n)
    Space complexity: O(1)
    """
    for i in range(len(input_list)-1):
        if input_list[i] == value:
            return i
    return -1

test_list = [1,3,9,11,15,19,29]
test_value1 = 25
test_value2 = 15
print linear_search(test_list, test_value1)
print linear_search(test_list, test_value2)
