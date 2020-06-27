
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
		int arr[]=new int[n];
		int val=sc.nextInt();
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		System.out.println(minCoinToMakeVal(arr,n,val));
		System.out.println(GetMinCoins(arr,n,val));


	    
	}
	
	// recursive Solution for making value with using of min coins  from arr
	// input= coins[]={25, 10 ,5} value=30 output= 2  (25+5)
	// use minimum number of coins so that we can found that given vaue sum;
	
	
	static int minCoinToMakeVal(int coins[],int n,int val)
	{
	    if(val==0){
	        return 0;
	    }
	    int res=Integer.MAX_VALUE;
	    for(int i=0;i<n;i++){
	        if(coins[i]<=val){
	            int sub_res=minCoinToMakeVal(coins,n,val-coins[i]);
	            if(sub_res!=Integer.MAX_VALUE){
	                res=Math.min(res,sub_res+1);
	            }
	        }
	    }
	    return res;
	    
	}
	
	// Dynamic programming implementation of GetMinCoins
	
	static int GetMinCoins(int coins[],int n,int val)
	{
	    int dp[]=new int[val+1];
	    dp[0]=0;
	    for(int i=1;i<=val;i++){
	        dp[i]=Integer.MAX_VALUE;
	    }
	    for(int i=1;i<=val;i++)
	    {
	        for(int j=0;j<n;j++)
	        {
	            if(coins[j]<=i)
	            {
	                int sub_res=dp[i-coins[j]];
	                if(sub_res!=Integer.MAX_VALUE)
	                {
	                    dp[i]=Math.min(dp[i],sub_res+1);
	                }
	            }
	        }
	    }
	    return dp[val];
	}
}
