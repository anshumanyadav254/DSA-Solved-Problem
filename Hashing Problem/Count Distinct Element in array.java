import java.util.*;
public class CountDistinctElement {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		//System.out.println(Broutforce(arr,n));
		System.out.println(EfficientCountDistinct(arr,n));
	}
	static int Broutforce(int arr[],int n)
	{
		int res=0;
		for(int i=0;i<n;i++)
		{
			boolean flag=false;
			for(int j=i-1;j>=0;j--)
			{
				if(arr[j]==arr[i])
				{
					flag=true;
					break;
				}
			}
			if(flag==false)
			{
				res++;
			}
		}
		return res;

	}
	static int EfficientCountDistinct(int arr[],int n)
	{
		HashSet<Integer>hm=new HashSet<Integer>();
		for(int i=0;i<n;i++)
		{
			hm.add(arr[i]);
		}
		return hm.size();
	}
}
