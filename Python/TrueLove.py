print("Enter the couples' names")

name1 = input()
name2 = input()

print(name1 + " " + name2)


def calculateTrueLove(name1, name2):
    if(name1 is None or name2 is None):
        return "Input not received"
    if(type(name1) != str or type(name2) != str):
        return "The only accepted input are strings"
    
    true_array = ['t','r','u','e']
    love_array = ['l','o','v','e']
    
    truecount = 0
    lovecount = 0

    truelen = 4
    lovelen = 4

    for i in range(0, truelen):
        truecount += name1.lower().count(true_array[i])
        truecount += name2.lower().count(true_array[i])

    for j in range(0, lovelen):
        lovecount += name1.lower().count(love_array[j])
        lovecount += name2.lower().count(love_array[j])
    
    return int(str(truecount) + str(lovecount))

print(calculateTrueLove(name1, name2))