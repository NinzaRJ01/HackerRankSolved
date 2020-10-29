# Alex works at a clothing store. There is a large pile of socks that must be paired by color for sale. Given an array of integers representing the color of each sock, determine how many pairs of socks with matching colors there are.

# For example, there are n=7
# socks with colors ar=[1,2,1,2,1,3,2] . There is one pair of color and one of color . There are three odd socks left, one of each color. The number of pairs is . 
def sockMerchant(n,ar):
    ar.sort()
    stack =[]
    socks_val = {}
    for i in ar :
        if i in stack :
            socks_val[i]+=1
            # print(socks_val)
        else :
            stack.append(i)
            # print(i)
            socks_val[i] = 1
    pair = 0
    for i in stack :
        if socks_val[i]%2 == 0 and socks_val[i] != 0:
            pair+= socks_val[i]/2
        elif socks_val[i]%2 !=0 and socks_val[i] != 0 and socks_val[i]>1:
            pair+=(socks_val[i]-1)/2
    return pair 



arr =[10,20,20,10,10,30,50,10,20]
n = len(arr)
x = sockMerchant(n,arr)
print(x)
