import java.util.*;
import java.lang.*; 
class Codechef

{

public static void main(String args[]){
    
    
    Scanner sc=new Scanner(System.in);

    int n=sc.nextInt();
    int arr[]=new int[1000];
    int l[]=new int[n];
    int r[]=new int[n];
    for(int i=0;i<n;i++)
    {
        l[i]=sc.nextInt();
        r[i]=sc.nextInt();
        
    }
    for(int i=0;i<n;i++)
    {
        arr[l[i]]++;
        arr[r[i]+1]--;
    }
    int max=arr[0],res=0;
    for (int i=1;i<1000;i++)
    {
        arr[i]+=arr[i-1];
        if(max<arr[i])
        {
            max=arr[i];
            res=i;
        }
            
    }
    System.out.println(res);

}

}
