n,a,b,c=[int(x) for x in input().split()]
def fun(n,a,b,c):
    if(n==0):
        return 0
    if(n<0):
        return -1
    res=max(fun(n-a,a,b,c),fun(n-b,a,b,c),fun(n-c,a,b,c))
    if(res==-1):
        return -1
    return res+1
print(fun(n,a,b,c))
