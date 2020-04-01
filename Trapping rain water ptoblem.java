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
	    int res=0;
	    int lmax[]=new int[n];
	    int rmax[]=new int[n];
	    lmax[0]=arr[0];
	    for(int i=1;i<n;i++)
	    {
	        lmax[i]=Math.max(arr[i],lmax[i-1]);
	    }
	    rmax[n-1]=arr[n-1];
	    for(int i=n-2;i>=0;i--)
	    {
	        rmax[i]=Math.max(arr[i],rmax[i+1]);
	    }
	    for(int i=1;i<n-1;i++)
	    {
	        res=res+Math.min(lmax[i],(rmax[i]-arr[i]));
	    }
	    
	    System.out.println(res);
	}
}
