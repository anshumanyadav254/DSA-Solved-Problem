for i in range(t):
    n=int(input())
    s=str(input())
    l,r,u,d,a,b=0,0,0,0,0,0
    for i in range(len(s)):
        if(s[i]=="L" and a==0):
            l+=1
            a=1 
            b=0
            
        elif(s[i]=="R" and a==0):
            r+=1
            a=1 
            b=0
        elif(s[i]=="U" and b==0):
            u+=1 
            a=0
            b=1 
        elif(s[i]=="D" and b==0):
            d+=1 
            a=0
            b=1 
    x=0-l+r  
    y=0+u-d
    print(x,y)
