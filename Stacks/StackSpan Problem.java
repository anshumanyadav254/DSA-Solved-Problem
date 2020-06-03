import java.util.*;
public class StackSpan {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for (int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		//BroutForce(arr,n);
		SpanStackEfficient(arr,n);
	}
	static void BroutForce(int arr[],int n)
	{
		for(int i=0;i<n;i++)
		{
			int span=1;
			for(int j=i-1;j>=0;j--)
			{
				if(arr[i]<=arr[i]){
					span++;
				}
				else {
					break;
				}
			}
			System.out.println(span+" ");
		}
	}
	static void SpanStackEfficient(int arr[],int n)
	{
		Stack<Integer>s=new Stack<Integer>();
		s.push(0);
		System.out.print(1+" ");
		for(int i=1;i<n;i++)
		{
			while (s.isEmpty()==false && arr[s.peek()]<=arr[i]){
				s.pop();
			}
			int span=(s.isEmpty())?(i+1):(i-s.peek());
			System.out.print(span+" ");
			s.push(i);
		}
	}
}
// Number of element present in left side of an element in arr that is called stack span 
/* input= n=10
arr=15 13 12 14 16 8 6 4 10 30
out put=1 1 1 3 5 1 1 1 4 10 
*/
