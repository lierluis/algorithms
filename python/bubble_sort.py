def bubble_sort(input_list):
    """Sort a list using bubble sort algorithm.

    Time complexity: O(n^2)
    Space complexity: O(1)
    """
    swapped = True
    list_length = len(input_list)-1
    while list_length > 0 and swapped:
        swapped = False
        for i in range(list_length):
            if input_list[i] > input_list[i+1]:
                tmp = input_list[i]
                input_list[i] = input_list[i+1]
                input_list[i+1] = tmp
                swapped = True
        list_length -= 1

test_list = [8, 1, 3, 0, 7, 2, 10]
print("Unsorted:", test_list)
bubble_sort(test_list)
print("  Sorted:", test_list)
