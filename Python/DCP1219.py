functions = []
for i in range(10):
    functions.append(lambda : i)

for f in functions:
    print(f())

print("\n")

#First Loop (Creating Lambda Functions):

#An empty list functions is created.
#A for loop runs 10 times, with i taking values from 0 to 9.
#Each iteration appends a lambda function to the list functions. This lambda function captures the variable i.

#Second Loop (Calling Lambda Functions):
#Another for loop iterates over the list of lambda functions.
#Each lambda function is called, and the result is printed.

#The Issue
#The lambda functions capture the variable i, not its value at the time the lambda was created. Because i is a shared variable that changes during each iteration of the loop, all the lambda functions end up capturing the same final value of i, which is 9.

#When you call each lambda function, it returns the current value of i, which is 9.

#The solution is to pass i as a default argument to the lambda function. 
#Default arguments are evaluated at the time the function is created, which effectively captures the current value of i:

functions = []
for i in range(10):
    functions.append(lambda i=i: i)  # Capture the current value of i

for f in functions:
    print(f())