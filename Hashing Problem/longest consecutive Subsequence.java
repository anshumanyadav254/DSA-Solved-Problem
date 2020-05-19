/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

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
		//System.out.println(langestConsecutiveSequnce(arr,n));
		System.out.println(longestConsecutiveSubSeq(arr,n));
		
		
	}
	
  // Brout Force Aproach
  
	static int langestConsecutiveSequnce(int arr[],int n)
	{
	    Arrays.sort(arr);
	    int res=1,curr=1;
	    for(int i=1;i<n;i++)
	    {
	        if(arr[i]==arr[i-1]+1)
	        {
	            curr++;
	        }
	        else
	        {
	            res=Math.max(res,curr);
	            curr=1;
	            
	        }
	    }
	    res=Math.max(res,curr);
	    return res;
	}
  
	// Efficient Aproach
  
	static int longestConsecutiveSubSeq(int arr[],int n)
	{
	    int res=1;
	    int curr=1;
	    HashSet<Integer>h=new HashSet<Integer>();
	    for(int i=0;i<n;i++)
	    {
	        h.add(arr[i]);
	    }
	    for(int i=0;i<n;i++)
	    {
	        if(h.contains(arr[i]-1))
	        {
	            curr=1;
	            
	        }
	        while(h.contains(arr[i]+curr)){
	            curr++;
	        }
	         res=Math.max(res,curr);
	    }
	   return res;
	}
}
/*
 find number of consecutive number or subsequence not in any order in given Array

input=6
1 3 2 3 7 8
output=4

