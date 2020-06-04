import java.util.*;
public class Histogram
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		//System.out.print(GetMaxArea(arr,n));
		System.out.print(GetmaxAreaEffi(arr,n));
	}
	static int GetMaxArea(int arr[],int n)
	{
		int res=0;
		for(int i=0;i<n;i++)
		{
			int curr=arr[i];
			for(int j=i-1;j>=0;j--)
			{
				if(arr[j]>=arr[i])
				{
					curr+=arr[i];
				}
				else
				{
					break;
				}
			}
			for(int j=i+1;j<n;j++)
			{
				if(arr[j]>=arr[i])
				{
					curr+=arr[i];
				}
				else {
					break;
				}
			}
			res=Math.max(res,curr);
		}
		return res;
	}
	static int GetmaxAreaEffi(int arr[],int n)
	{
		Stack<Integer>s=new Stack<Integer>();
		int res=0;
		for(int i=0;i<n;i++)
		{
			while(s.isEmpty()==false && arr[s.peek()]>=arr[i])
			{
				int tp=s.pop();
				int curr=arr[tp]*((s.isEmpty())?i:(i-s.peek()-1));
				res=Math.max(res,curr);

			}
			s.push(i);
		}
		while (s.isEmpty()==false)
		{
			int tp=s.pop();
			int curr=arr[tp]*((s.isEmpty())?n:(n-s.peek()-1));
			res=Math.max(res,curr);
		}
		return res;
	}
}
/*
histogram is problem in which you hav to find max area of that histogram for example
input= n=7
  arr=[]=6 2 5 4 1 5 6
output=10

 */
