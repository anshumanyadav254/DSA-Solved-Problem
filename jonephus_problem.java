import java.util.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		System.out.println(fun(n,k));

	}
	static int fun(int n,int k)
	{
	    if(n==1)
	    {
	        return 0;
	    }
	    else
	    {
	        return (fun(n-1,k)+k)%n;
	        
	    }

	}
}
