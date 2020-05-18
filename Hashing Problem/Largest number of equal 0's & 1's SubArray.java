
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int [n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println(FindEqSub(arr,n));
		//System.out.println(EqNoZero(arr,n));
		/*for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]+" ");
		}*/
	}
	static int EqNoZero(int arr[],int n){
		int res=0;
		for(int i=0;i<n;i++){
			int c0=0;
			int c1=0;
			for(int j=i;j<n;j++)
			{
				if(arr[j]==0)
				{
					c0++;

				}
				else {
					c1++;
				}
				if(c0==c1)
				{
					res=Math.max(res,j-i+1);
				}
			}
		}
		return res;
	}

	static int FindEqSub(int arr[],int n)
	{
		for(int i=0;i<n;i++)
		{
			if(arr[i]==0)
			{
				arr[i]=-1;
			}
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
i/p= 8
1 0 1 1 1 1 0 1
o/p=2
*/
