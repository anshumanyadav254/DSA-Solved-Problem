/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int len=sc.nextInt();
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		System.out.println(MxCutDpSol(len,a,b,c));
	}
	
	/*
	you have given length of rod n, and you have to cut these rod only given cuts only a,b,c 
	 Answer is tell the max cuts  of rod only in given length;
	*/
	
	
	static int MxCutDpSol(int n,int a,int b,int c){
	    int dp[]=new int[n+1];
	    dp[0]=0;
	    for(int i=1;i<=n;i++){
	        dp[i]=-1;
	        if(i-a>=0){
	            dp[i]=Math.max(dp[i],dp[i-a]);

	        }
	        if(i-b>=0){
	            dp[i]=Math.max(dp[i],dp[i-b]);
	        }
	        if(i-c>=0){
	            dp[i]=Math.max(dp[i],dp[i-c]);
	        }
	        if(dp[i]!=-1){
	            dp[i]++;
	        }
	    }
	    return dp[n];
	}
}
