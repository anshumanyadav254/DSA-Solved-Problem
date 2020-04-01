import java.util.*;
import java.lang.*;
import java.io.*;
import java.lang.Math;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	    int arr[]=new int[n];
	    for(int i=0;i<arr.length;i++)
	    {
	        arr[i]=sc.nextInt();
	    }
	    int res=arr[0];
	    for (int i=0;i<n;i++)
	    {
	        int curr=0;
	        for(int j=i;j<n;j++)
	        {
	            curr=curr+arr[j];
	            res=Math.max(curr,res);
	        }
	    }
	    
	    System.out.println(res);
	    
	}
}
