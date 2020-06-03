import java.util.*;
public class NextMostGreater
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int [n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		//printNxtGrt(arr,n);
		System.out.print(printNxtEff(arr,n));
	}
	static void printNxtGrt(int arr[],int n)
	{
		for(int i=0;i<n;i++)
		{
			int j;
			for(j=i+1;j<n;j++)
			{
				if(arr[j]>arr[i])
				{
					System.out.print(arr[j]+" ");
					break;
				}
			}
			if(j==n)
			{
				System.out.print(-1+" ");
			}
		}
	}
	static ArrayList printNxtEff(int arr[],int n)
	{
		Stack<Integer>s=new Stack<Integer>();
		ArrayList<Integer>a=new ArrayList<Integer>();
		s.push(arr[n-1]);
		a.add(-1);
		for (int i=n-2;i>=0;i--)
		{
			while (s.isEmpty()==false && s.peek()<=arr[i])
			{
				s.pop();
			}
			int nxg=s.isEmpty()?-1:s.peek();
			a.add(nxg);
			s.push(arr[i]);
		}
		Collections.reverse(a);
		return a;
	}
}

/*
  find next most greater Element element in Array 
  nearest next greater element in Array
  input: n=10 arr=[5 15 10 8 6 12 9 18 9 10]
  
  out put=[15, 18, 12, 12, 12, 18, 18, -1, 10, -1]
  
 */
