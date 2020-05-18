import java.util.*;

public class LengthOfSumOfSubArray
{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for (int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int sum=sc.nextInt();
		//System.out.println(maxLenOfSubArray(arr,n,sum));
		System.out.println(maxLen(arr,n,sum));
	}
	static int maxLenOfSubArray(int arr[],int n,int sum)
	{
		int curr_sum=0,res=0;
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				curr_sum+=arr[j];
				if(curr_sum==sum)
				{
					res=Math.max(res,j-i+1);
				}
			}
		}
		return res;
	}
	static int maxLen(int arr[],int n,int sum)
	{
		HashMap<Integer,Integer>hm=new HashMap<Integer, Integer>();
		int res=0;
		int pre_sum=0;
		for(int i=0;i<n;i++)
		{
			pre_sum+=arr[i];
			if(pre_sum==sum){
				return i+1;
			}
			if(hm.containsKey(pre_sum)==false)
			{
				hm.put(pre_sum,i);
			}
			if(hm.containsKey(pre_sum-sum)){
				res=Math.max(res,i-hm.get(pre_sum-sum));
			}

		}
		return res;
	}
}

/*
input=
5
1 2 34 5 6
45
out put =3 */
