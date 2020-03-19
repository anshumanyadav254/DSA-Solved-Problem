t=int(input())
for i in range(t):
    n,k=[int(x) for x in input().split()]
    lst=[int(x) for x in input().split()]
    l=sorted(lst)
    print(l[k-1])
