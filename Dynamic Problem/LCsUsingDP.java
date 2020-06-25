import java.util.Arrays;
import java.util.Scanner;


/*
In this problem we have to find longest common subsequence of two string
 */
public class LCsUsingDP {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		int m=s1.length();
		int n=s2.length();
		System.out.println(lcsLen(s1,s2,m,n));
		System.out.println(DPlcs(s1,s2));

	}

	static int lcsLen(String s1,String s2,int m,int n){
		 int memo[][]=new int[m+1][n+1];
		for(int i=0;i<=m;i++){
			for(int j=0;j<=n;j++){
				memo[i][j]=-1;
			}
		}
		if(memo[m][n]!=-1){
			return memo[m][n];

		}
		if(m==0 || n==0){
			memo[m][n]=0;
		}
		else {
			if(s1.charAt(m-1)==s2.charAt(n-1)){
				memo[m][n]=1+lcsLen(s1,s2,m-1,n-1);
			}
			else{
				memo[m][n]=Math.max(lcsLen(s1,s2,m-1,n),lcsLen(s1,s2,m,n-1));
			}
		}
		return memo[m][n];
	}
	static int DPlcs(String s1,String s2){
		int m=s1.length();
		int n=s2.length();
		int dp[][]=new int [m+1][n+1];
		for(int i=0;i<=m;i++){
			dp[i][0]=0;

		}
		for(int i=0;i<=n;i++){
			dp[0][i]=0;

		}
		for(int i=1;i<=m;i++){
			for(int j=1;j<=n;j++){
				if(s1.charAt(i-1)==s2.charAt(j-1)){
					dp[i][j]=1+dp[i-1][j-1];
				}
				else {
					dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
				}
			}
		}
        return dp[m][n];

	}
}
