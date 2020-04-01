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
	    int maxEnding=arr[0];
	    for(int i=1;i<n;i++)
	    {
	        maxEnding=Math.max(maxEnding+arr[i],arr[i]);
	        res=Math.max(res,maxEnding); 
	    }
	    System.out.println(res);
	    
	}
}
