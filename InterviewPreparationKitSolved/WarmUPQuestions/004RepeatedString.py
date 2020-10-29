# To Do:
""" 
Q--> Lilah has a string(s){all lowercase English} 
note: it will repeat its self infintely many times.
should return : number of letter a's in the first n letters of infinite string
Ex -- s='abcac' and n=10 
    => so first 10 letters of infinite string will be:
    'a|b|c|a|c|a|b|c|a|c|'
    So no. of a's in this is 4
"""
import math
def repeatedString(s,n):#Here s is string and n is integer
    
    #Note Instead of traversing string again and again
    # (increasing the computing time)
    # ,we gonna note the no. of a's in provided string
    # and calcuate mathematical the answer acc. to
    # n (which is given)
    lengthOfS = len(s)
    noOfAInGivenString = 0
    for i in s:
        if(i=='a'):
            noOfAInGivenString+=1
    subStringIteration = math.floor(n/lengthOfS)
    totalAInInfiniteString = noOfAInGivenString * subStringIteration
    if(noOfAInGivenString%lengthOfS!=0):
        leftIterations = n- (lengthOfS*subStringIteration)
        for i in range(leftIterations):
            if(s[i]=='a'):
                totalAInInfiniteString+=1
    return totalAInInfiniteString
x=repeatedString('aaaaaaaaa',45340)
print(x)