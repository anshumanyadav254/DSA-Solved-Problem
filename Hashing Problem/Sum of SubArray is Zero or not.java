import java.util.HashSet;
import java.util.Scanner;

public class ZeroSumSubArray {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();

		}
		//System.out.println(isZerosumNaiv(arr,n));
		System.out.println(ZeroSumSubarray(arr,n));
	}
	static boolean isZerosumNaiv(int arr[],int n)
	{
		int curr_sum=0;
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				curr_sum=curr_sum+arr[i]+arr[j];
				if(curr_sum==0)
				{
					return  true;
				}
			}


		}
		return false;
	}
	static boolean ZeroSumSubarray(int arr[],int n)
	{
		HashSet<Integer>s=new HashSet<Integer>();
		int PreSum=0;
		for(int i=0;i<n;i++)
		{
			PreSum=PreSum+arr[i];
			if(s.contains(PreSum))
			{
				return true;
			}
			if(PreSum==0)
			{
				return true;
			}
			s.add(PreSum);
		}
		return false;
	}
}
