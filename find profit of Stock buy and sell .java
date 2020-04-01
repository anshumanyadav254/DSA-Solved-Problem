import java.util.*;
import java.lang.*;
import java.io.*;
import java.lang.Math;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	    int price[]=new int[n];
	    for(int i=0;i<price.length;i++)
	    {
	        price[i]=sc.nextInt();
	    }
	    int profit=0;
	    for(int i=1;i<n;i++)
	    {
	        if(price[i]>price[i-1])
	        {
	            profit=profit+(price[i]-price[i-1]);
	        }
	        
	    }
	    System.out.println(profit);
	}
}
