import java.util.Scanner;
import java.util.*;
public class GivenSumpair {
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
		//System.out.println(IsPairNaiv(arr,n,sum));
		System.out.println(ispairEfficient(arr,n,sum));
	}
	static  boolean IsPairNaiv(int arr[],int n ,int sum)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]+arr[j]==sum)
				{
					return  true;
				}

			}
		}
		return  false;

	}
	 static boolean ispairEfficient(int arr[],int n,int sum)
	{
		HashSet<Integer>s=new HashSet<>();
		for(int i=0;i<n;i++)
		{
			if(s.contains(sum-arr[i])){
				return  true;
			}
			s.add(arr[i]);
		}
		return false;
	}
}
