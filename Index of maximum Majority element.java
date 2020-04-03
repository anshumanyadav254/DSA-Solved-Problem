import java.util.*;
import java.util.Arrays;
import java.lang.*;
import java.io.*;
import java.lang.Math;
class Codechef
{
	public static void main (String[] args)
	{
        Scanner sc = new Scanner(System.in); 
       
        int n=sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int res=0,count=1;
        for(int i=1;i<n;i++)
        {
            if(arr[res]==arr[i])
            {
                count+=1;
            }
            else
            {
                count-=1;
            }
            if(count==0)
            {
                res=i;
                count=1;
            }
        }
        count=0;
        for(int i=0;i<n;i++)
        {
            if(arr[res]==arr[i]){
                count+=1;
                
            }
           
        }
        if(count<=n/2)
        {
            res=-1;
        }
        System.out.println(res);

  }  
}  
