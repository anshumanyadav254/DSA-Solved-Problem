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
		segregationNEgativPositive(arr,0,n);
		for(int i=0;i<n;i++)
		{
		    System.out.print(arr[i]+" ");
		}
		
	}
	static void segregationNEgativPositive (int arr[],int l,int h)
	{
	   int i=l-1;
	   int j=h;
	   while(true)
	   {
	       do{i++;}while(arr[i]<0);
	       do{j--;}while(arr[j]>0);
	       if(i>=j){
	           return;
	       }
	       int temp=arr[i];
	       arr[i]=arr[j];
	       arr[j]=temp;
	   }
	}
	
}
//input=n=10
//arr[]=-1 6 -8 4 -7 0 -3 -6 16 17 output= -1 6 -8 4 -7 0 -3 -6 16 17
