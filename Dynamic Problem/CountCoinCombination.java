import java.util.Scanner;
/*
this problem contains count the number of ways of coins so that given sum is found you have
given type of coin u can use them multiple times;
 */



public class CountCoinCombination {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int [n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		int sum=sc.nextInt();
		//System.out.println(getCount(arr,n,sum));
		System.out.println(getCountDP(arr,n,sum));


	}
	static int getCount(int coins[],int n,int sum){
		if(sum==0){
			return 1;
		}
		if(n==0){
			return 0;
		}
		int res=getCount(coins,n-1,sum);
		if(coins[n-1]<=sum){
			res+=getCount(coins,n,sum-coins[n-1]);
		}
		return res;
	}
	static int getCountDP(int coins[],int n,int sum){
		int dp[][]=new int[sum+1][n+1];
		for(int i=0;i<=n;i++){
			dp[0][i]=1;
		}
		for(int j=0;j<=sum;j++){
				dp[j][0]=0;
			}
		for(int i=1;i<=sum;i++){
			for(int j=1;j<=n;j++){
				dp[i][j]=dp[i][j-1];
				if(coins[j-1]<=i){
					dp[i][j]+=dp[i-coins[j-1]][j];
				}
			}
		}
		return dp[sum][n];

	}
}
