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
		sort012(arr,n);
		for(int i=0;i<n;i++)
		{
		    System.out.print(arr[i]+" ");
		}
		
	}
	static void sort012 (int arr[],int n)
	{
	   
	   int low=0,high=n-1,mid=0;
	   while(mid<=high)
	   {
	       switch(arr[mid])
	       {
	           case 0:
	               int temp=arr[low];
	               arr[low]=arr[mid];
	               arr[mid]=temp;
	               low++;
	               mid++;
	               break;
	           case 1:
	               mid++;
	               break;
	           case 2:
	               int t=arr[mid];
	               arr[mid]=arr[high];
	               arr[high]=t;
	               high--;
	               break;
	               
	           
	       }
	   }
	}
	
}
