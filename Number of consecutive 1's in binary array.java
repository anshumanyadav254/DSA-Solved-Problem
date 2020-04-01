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
	    int res=0,curr=0;
	    for(int i=0;i<n;i++)
	    {
	        if(arr[i]==0){
	            curr=0;
	        }
	        else{
	            curr++;
	            res=Math.max(res,curr);
	        }
	        
	    }
	    System.out.println(res);
	    
	    
	}
}
