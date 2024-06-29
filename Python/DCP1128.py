list = []

print("Enter numbers one by one to go into the list \nTo stop press 's' ")

while(True):
    i = input()
    if(i == 's'):
        break
    list.append(int(i))

n = len(list)

# Fill used/perm array with 0
used = [0 for i in range(n)]
perm = [0 for i in range(n)]   
k = 0
def print_perms(list, perm, used, k, n):

    
    # If the number of fixed positions in the list equals
    # the length of the list, we are done with this permutation, print it
    if(k == n):
        print(list)

    i = 0
    for i in range(n - 1):
       # If this position isn't used
       if(used != 0):
           
           # Indicate that this position is used
           used[i] = 1
           perm[k] = list[i]
           print_perms(list, perm, used, k + 1, n)
           
           # After this permutation is done being printed, free this position to be used again
           used[i] = 0 

    return None

print_perms(list, perm, used, k, n)
