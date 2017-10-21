def is_palindrome(input_string):
    """Check whether a string is a palindrome (same when reversed)

    Time complexity: O(n)
    Space complexity: O(1)
    """
    length = len(input_string)
    for i in range(0, length//2):
        if input_string[i] != input_string[length-i-1]:
            return False
    return True

if __name__ == "__main__":
    tests = ["madam", "aabb", "race car", ""]
    for test in tests:
        print("\"{}\" is a palindrome? {}".format(test, is_palindrome(test)))
