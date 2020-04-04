import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
		    arr[i]=sc.nextInt();
		}
		int l=0,h=n-1;
		int x=sc.nextInt();
		System.out.println(Binary_search(arr,l,h,x));
		
	}
    static int Binary_search(int arr[],int l,int h,int x)
	{
	    if(l>h){
	        return -1;
	    }
	    int mid=l+(h-l)/2;
	    
	    if(arr[mid]==x && (mid==0 || arr[mid-1]!=x))
	    {
	        return mid;
	    }
	    if(arr[mid]>=x)
	    {
	        return Binary_search(arr,l,mid-1,x);
	    }
	    else
	    {
	        return Binary_search(arr,mid+1,h,x);
	    }
	}
}
// I/P :n=4 arr[]=2 3 3 3; x=3;
// O/P : 1
// Array should be in sorted order
