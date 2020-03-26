class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	    int arr[]=new int[n];
	    for(int i=0;i<n;i++)
	    {
	        arr[i]=sc.nextInt();
	    }
	    int sum=sc.nextInt();
		System.out.println(fun(arr,n,sum));

	}
	static int fun(int arr[],int n,int sum)
	{
	    if(n==0)
	    {
	        return (sum==0)?1:0;
	    }
	    else
	    {
	        return fun(arr,n-1,sum)+fun(arr,n-1,sum-arr[n-1]);
	        
	    }

	}
}
