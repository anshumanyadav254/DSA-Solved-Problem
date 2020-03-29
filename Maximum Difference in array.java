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
	    int res=arr[1]-arr[0];
	    int minVal=arr[0];
	    for(int i=1;i<n;i++){
	        res=Math.max(res,arr[i]-minVal);
	        minVal=Math.min(minVal,arr[i]);
	    }
	    System.out.println(res);
	}
}
