/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
		    arr[i]=sc.nextInt();
		}
		int x=sc.nextInt();
		System.out.println(arr[kTh_smallest(arr,n,x)]);
		
	}
	static int partition (int arr[],int l,int h)
	{
	    //l=0;
	    //h=(arr.length)-1;
	    int pivot=arr[h];
	    int i=l-1;
	    for(int j=l;j<=h-1;j++)
	    {
	        if(arr[j]<pivot){
	            i++;
	            int temp=arr[i];
	            arr[i]=arr[j];
	            arr[j]=temp;
	        }
	    }
	    int temp=arr[i+1];
	    arr[i+1]=arr[h];
	    arr[h]=temp;
	    return i+1;
	}
	static int kTh_smallest(int arr[],int n,int k)
	{
	    int l=0,h=n-1;
	    while(l<=h)
	    {
	        int p=partition(arr,l,h);
	        if(p==k-1){
	            return p;
	        }
	        else if(p>k-1)
	        {
	            h=p-1;
	        }
	        else{
	            l=p+1;
	        }
	    }
	    return -1;
	    
	}
}
// using this by lamuto partion of quick sort worst case time complexity is O(n*n) and best case O(n) and also in AVG case O(n);
//it changes input array
// i/p n=5 arr= 1 4 6 7 3 k=2 output=3
