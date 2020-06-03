import  java.util.*;
public class PreviousGreaterElement {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		//printPrevGrtrEle(arr,n);
		printGreaterPrevEff(arr,n);
	}
	static void printPrevGrtrEle(int arr[],int n)
	{
		for(int i=0;i<n;i++)
		{
			int j;
			for(j=i-1;j>=0;j--)
			{
				if(arr[j]>arr[i])
				{
					System.out.print(arr[j]+" ");
					break;
				}

			}
			if(j==-1)
			{
				System.out.print(-1+" ");
			}
		}
	}

	static void printGreaterPrevEff(int arr[],int n)
	{
		Stack<Integer>s=new Stack<Integer>();
		s.push(arr[0]);
		System.out.print(-1+" ");
		for(int i=1;i<n;i++)
		{
			while(s.isEmpty()==false && s.peek()<=arr[i])
			{
				s.pop();
			}
			int pg=(s.isEmpty())?-1:s.peek();
			System.out.print(pg+" ");
			s.push(arr[i]);
		}

	}
}
/*
find left most greater element of an element in array given a array
input= n=8 arr=[15 10 18 12 4 6 2 8]
output= -1 15 -1 18 12 12 6 12
 */
