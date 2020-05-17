import java.util.*;
public class CountInterction {
	public  static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int a[]=new int[m];
		for(int i=0;i<m;i++)
		{
			a[i]=sc.nextInt();
		}
		int b[]=new int[n];
		for(int i=0;i<n;i++)
		{
			b[i]=sc.nextInt();
		}
		System.out.println(CountIntersection(a,b,m,n));
		//System.out.println(intersectioncount(a,b,m,n));
	}
	static  int CountIntersection(int a[],int b[],int m,int n)
	{
		int res=0;
		for(int i=0;i<m;i++)
		{
			boolean flag=false;
			for(int j=0;j<=i-1;j++)
			{
				if(a[j]==a[i])
				{
					flag=true;
					break;
				}
			}
			if(flag==true)
			{
				continue;
			}
			for(int j=0;j<n;j++)
			{
				if(a[i]==b[j])
				{
					res++;
					break;
				}
			}
		}
		return res;

	}
	static int intersectioncount(int a[],int b[],int m,int n)
	{
		int res=0;
		HashSet <Integer>s=new HashSet<Integer>();
		for(int i=0;i<m;i++){
			s.add(a[i]);
		}
		for(int i=0;i<n;i++){
			if(s.contains(b[i])){
				res++;
				s.remove(b[i]);
			}
		}
		return res;
	}
}
