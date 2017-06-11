def linear_search(array, value):
    for i in range(len(array)-1):
        if array[i] == value:
            return i
    return -1

array = [1,3,9,11,15,19,29]
value1 = 25
value2 = 15
print linear_search(array, value1)
print linear_search(array, value2)
