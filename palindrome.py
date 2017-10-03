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

print(is_palindrome("madam")) # true
print(is_palindrome("aabb")) # false
print(is_palindrome("race car")) # false
print(is_palindrome("")) # true
