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
        int sum=sc.nextInt();
        System.out.println(isSubSum(arr,n,sum));
    }  
    static boolean isSubSum(int arr[],int n,int sum)
    {
        int curr_sum=arr[0],s=0;
        for(int e=1;e<n;e++)
        {
            while(curr_sum>sum && s<e-1)
            {
                curr_sum-=arr[s];
                s++;
            }
            if(curr_sum==sum)
            {
                return true;
            }
            if(e<n)
            {
                curr_sum+=arr[e];
            }
        }
        return curr_sum==sum;
        
    }
  
}  
