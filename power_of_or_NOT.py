n=int(input())
def fun(n):
    if(n==0):
        return False
    return((n & (n-1))==0)
print(fun(n))
