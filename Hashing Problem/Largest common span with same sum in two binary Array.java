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
		int arr1[]=new int [n];
		for(int i=0;i<n;i++)
		{
			arr1[i]=sc.nextInt();
		}
		int arr2[]=new int[n];
		for(int i=0;i<n;i++){
		    arr2[i]=sc.nextInt();
		}
		//System.out.println(MostCommonSum(arr1,arr2,n));
		System.out.println(lorgestSumCommon(arr1,arr2,n));

	}
	static int MostCommonSum(int arr1[],int arr2[],int n)
	{
		int res=0;
		for(int i=0;i<n;i++){
			int sum1=0;
			int sum2=0;
			for(int j=i;j<n;j++)
			{
			    sum1+=arr1[j];
			    sum2+=arr2[j];
			
				if(sum1==sum2)
				{
					res=Math.max(res,j-i+1);
				}
			}
		}
		return res;
	}

	static int lorgestSumCommon(int arr1[],int arr2[],int n)
	{
	    int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=arr1[i]-arr2[i];
		}
		HashMap<Integer,Integer>hm=new HashMap<Integer, Integer>();
		int res=0;
		int pre_sum=0;
		for(int i=0;i<n;i++)
		{
			pre_sum+=arr[i];
			/**/
			if(hm.containsKey(pre_sum)==false)
			{
				hm.put(pre_sum,i);
			}
			if(hm.containsKey(pre_sum))
			{
				res=Math.max(res,i-hm.get(pre_sum));
			}

		}
		return res;

	}

}
/*
find the lenght of subarray starting and ending with same index and sum of that subarray is equal 

input=6
0 1 0 0 0 0
  -------
1 0 1 0 0 1
  -------

output=4
