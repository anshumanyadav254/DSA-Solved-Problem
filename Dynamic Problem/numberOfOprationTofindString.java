import java.util.Map;
import java.util.Scanner;

/*
find number of operation to convert one string to another string;
operation are only delete char and insert char and replace char
 */
public class numberOfOprationTofindString {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		System.out.println(EditDistRec(s1,s2,s1.length(),s2.length()));
		System.out.println(editstring(s1,s2,s1.length(),s2.length()));
	}
	static int EditDistRec(String s1,String s2,int m,int n){
		if(m==0){
			return n;
		}
		if(n==0){
			return m;
		}
		if(s1.charAt(m-1)==s2.charAt(n-1)) {
			return EditDistRec(s1,s2,m-1,n-1);

		}
		else {
			return 1+Math.min(EditDistRec(s1,s2,m-1,n)
					,Math.min(EditDistRec(s1,s2,m,n-1)
							,EditDistRec(s1,s2,m-1,n-1)));
		}
	}
	// Dp solution of number of operation.

	static int editstring(String s1,String s2,int m,int n){
		int dp[][]=new int[m+1][n+1];
		for(int i=0;i<=m;i++){
			dp[0][i]=i;
		}
		for(int j=0;j<=n;j++){
			dp[j][0]=j;
		}
		for(int i=1;i<=m;i++){
			for(int j=1;j<=n;j++){
				if(s1.charAt(i-1)==s2.charAt(j-1)){
					dp[i][j]=dp[i-1][j-1];
				}
				else {
					dp[i][j]=1+Math.min(dp[i-1][j],Math.min(dp[i][j-1],dp[i-1][j-1]));
				}

			}
		}
		return dp[m][n];
	}
}
