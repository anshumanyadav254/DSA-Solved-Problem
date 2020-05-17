import java.util.*;

public class CountUninion
{
	public  static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int a[] = new int[m];
		for (int i = 0; i < m; i++) {
			a[i] = sc.nextInt();
		}
		int b[] = new int[n];
		for (int i = 0; i < n; i++) {
			b[i] = sc.nextInt();
		}
		//System.out.println(cntUnion(a,b,m,n));
		System.out.println(CntUnionEfficent(a,b,m,n));

	}
	static int cntUnion(int a[],int b[],int m,int n){
		int res=0;
		int arr[]=new int[m+n];

		for (int i=0;i<m;i++){
			arr[i]=a[i];

		}
		for(int i=0;i<n;i++)
		{
			arr[m+i]=b[i];
		}
		for(int i=0;i<m+n;i++)
		{
			boolean flag=false;
			for(int j=0;j<=i-1;j++)
			{
				if(arr[i]==arr[j]){
					flag=true;
					break;
				}
			}
			if(flag==false){
				res++;

			}
		}
		return res;
	}
	static int CntUnionEfficent(int a[],int b[],int m,int n)
	{
		HashSet<Integer>s=new HashSet<Integer>();
		for(int i=0;i<m;i++)
		{
			s.add(a[i]);
		}
		for(int i=0;i<n;i++)
		{
			s.add(b[i]);
		}
		return s.size();
	}
}
