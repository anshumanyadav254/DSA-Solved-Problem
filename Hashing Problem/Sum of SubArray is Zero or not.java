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
		int sum=sc.nextInt();
		System.out.println(isSumInSubArrayNaiv(arr,n,sum));
		//System.out.println(IsSumSubarray(arr,n,sum));
	}
	static boolean isSumInSubArrayNaiv(int arr[],int n,int sum)
	{

		for(int i=0;i<n;i++)
		{
			int curr_sum=0;
			for(int j=i;j<n;j++)
			{
				curr_sum+=arr[j];
				if(curr_sum==sum)
				{
					return  true;
				}
			}


		}
		return false;
	}
	static boolean IsSumSubarray(int arr[],int n,int sum)
	{
		HashSet<Integer>s=new HashSet<Integer>();
		int PreSum=0;
		for(int i=0;i<n;i++)
		{
			PreSum=PreSum+arr[i];
			if(PreSum==sum)
			{
				return true;
			}
			if(s.contains(PreSum-sum))
			{
				return true;
			}

			s.add(PreSum);
		}
		return false;
	}
}

