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
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		int m=sc.nextInt();
		if(m>n){
		    System.out.println(-1);
		}
		Arrays.sort(arr);
		int res=arr[m-1]-arr[0];
		for(int i=1;i+m-1<n;i++)
		{
		    res=Math.min(res,arr[i+m-1]-arr[i]);
		}
		System.out.println(res);

	}
	
}
// problem is find min difference such that their differ is min within given range//
//minimum difference means differnce bt max and min element in given range//
