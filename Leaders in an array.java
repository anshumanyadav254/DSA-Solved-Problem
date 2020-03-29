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
	    for(int i=0;i<n;i++)
	    {
	        arr[i]=sc.nextInt();
	    }
	    int curr=arr[n-1];
	    System.out.print(curr+" ");
	    for(int i=n-2;i>0;i--)
	    {
	        if(curr<arr[i])
	        {
	            curr=arr[i];
	            System.out.print(curr+" ");
	        }
	    }
	}
}
