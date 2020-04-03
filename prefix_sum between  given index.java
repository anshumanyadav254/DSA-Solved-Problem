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
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            
            arr[i]=sc.nextInt();
        }
        int queries=sc.nextInt();
        for(int j=0;j<queries;j++)
        {
            int l=sc.nextInt();
            int r=sc.nextInt();
            int prefix_sum[]=new int[n];
            prefix_sum[0]=arr[0];
            int ans;
            for(int i=1;i<n;i++)
            {
                prefix_sum[i]=prefix_sum[i-1]+arr[i];
            
            }
            if(l!=0)
            {
                ans=prefix_sum[r] - prefix_sum[l-1];
            
            }
            else
            {
                ans=prefix_sum[r];
              
            }
            System.out.println(ans);
            
        }
        
     
    }
  
}
