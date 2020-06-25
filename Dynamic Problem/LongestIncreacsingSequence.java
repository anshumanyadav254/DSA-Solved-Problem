import java.util.Scanner;

public class LongestIncreacsingSequence {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int [n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println(lisEfficient(arr,n));

	}
	static int ceilidx(int tail[],int l,int r,int x){
		while (r>l){
			int m=l+(r-l)/2;
			if(tail[m]>=x){
				r=m;
			}
			else {
				l=m+1;
			}
		}
		return r;
	}
	static int lisEfficient(int arr[],int n ){
		int tail[]=new int[n];
		int len=1;
		tail[0]=arr[0];
		for(int i=1;i<n;i++){
			if(arr[i]>tail[len-1]){
				tail[len]=arr[i];
				len++;
			}
			else {
				int c=ceilidx(tail,0,len-1,arr[i]);
				tail[c]=arr[i];
			}
		}
		return len;
	}
}
