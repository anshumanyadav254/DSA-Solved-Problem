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
		int x=sc.nextInt();
		ThreeWayPartition(arr,n,x);
		for(int i=0;i<n;i++)
		{
		    System.out.print(arr[i]+" ");
		}
		
	}
	static void ThreeWayPartition (int arr[],int n,int pivot)
	{
	   
	   int low=0,high=n-1,mid=0;
	   while(mid<=high)
	   {
	       if(arr[mid]<pivot){
	           int temp=arr[low];
	               arr[low]=arr[mid];
	               arr[mid]=temp;
	               low++;
	               mid++;
	       }
	       
	       else if(arr[mid]==pivot)
	       {
	           mid++;

	       }
	      else if(arr[mid]>pivot){
	               int t=arr[mid];
	               arr[mid]=arr[high];
	               arr[high]=t;
	               high--;
	      }
	               
	               
	           
	       
	   }
	}
	
}
// break array in three way of partion make partition with respect to given pivot element make array in order that element less than
// pivot goes left side and element equal to pivot they are together element greater than pivot go right side
// inputn=9
// arr=2 2 1 1 1 10 10 20 30
// pivot=2
//output=. 1 1 1 2 2 10 20 30 10 
