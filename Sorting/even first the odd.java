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
	       do{i++;}while(arr[i]%2==0);
	       do{j--;}while(arr[j]%2!=0);
	       if(i>=j){
	           return;
	       }
	       int temp=arr[i];
	       arr[i]=arr[j];
	       arr[j]=temp;
	   }
	}
	
}
// i/p=10
//arr=1 2 3 4 5 6 7 8 9 0
//o/p=0 2 8 4 6 5 7 3 9 1 
// they can be any order
