# An answer to Daily Coding Problem 1204

# Given n numbers, find the greatest common denominator between them.

# For example, given the numbers [42, 56, 14], return 14.


# Find the greatest common factor given arr is the input array, n is the first number in the arry 
# and m is the second number in the array

# For the record, the first idea I had was a naive approach of dividing every element
# in the array by all the numbers before it and tracking all the divisors then taking the biggest one common to all of then i.e. the gcf


arr = [48, 18, 30, 42]

# Use Euclid's Algorithm to find the GCF iteratively
def greatestCommonFactorI(arr):
  
    if len(arr) == 0:
        return None
    # start our calculation from the first number in the array
    a = arr[0]

    # for each pair of numbers in the array, calculate the gcf
    for num in arr[1:]:
        while a != num: 
            if a > num:
                a = a - num
            else:
                num = num - a
    return a

# Use Euclid's algorithm to find the GCF recursively

def greatestCommonFactorR(arr):
    if len(arr) == 0:
        return None
    # start our calculation from the first number in the array
    a = arr[0]

    # for each pair of numbers in the array, calculate the gcf
    for b in arr[1:]:

        # Euclid's algorithm recursively
        while b != 0:

            # tuple assignment
            # the expression on the right side of the (=) is evaluated first, 
            # and then the resulting values are assigned to the variables on the left side of the assignment.
            # so the current value of b
            # then a % b
            # then assignments a -> b and b -> a % b
            a, b = b, a % b
    return a



gcf = greatestCommonFactorI(arr)

print(f"The GCF of the array is {gcf}")