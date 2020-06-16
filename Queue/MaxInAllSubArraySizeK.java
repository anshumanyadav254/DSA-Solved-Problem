import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class MaxInAllSubArraySizeK {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		//PrintMaxNaiv(arr,k);
		PrintMaxSubArryK(arr,k);

	}
	// Find the max of all subarray with size k and print that max value

	static void PrintMaxNaiv(int arr[],int k){
		int n=arr.length;
		for(int i=0;i<n-k+1;i++){
			int max=arr[i];
			for(int j=i+1;j<i+k;j++){
				max=Math.max(arr[j],max);
			}
			System.out.print(max+" ");
		}
	}
	static void PrintMaxSubArryK(int arr[],int k){
		int n=arr.length;
		Deque<Integer>dq=new LinkedList<Integer>();
		for(int i=0;i<k;i++){
			while(!dq.isEmpty() && arr[i]>=arr[dq.peekLast()] ){
				dq.removeLast();
			}
			dq.addLast(i);
		}
		for(int i=k;i<n;i++){
			System.out.print(arr[dq.peekFirst()]+" ");
			while (!dq.isEmpty() && dq.peekFirst()<=i-k){
				dq.removeFirst();

			}
			while (!dq.isEmpty() && arr[i]>=arr[dq.peekLast()]){
				dq.removeLast();
			}
			dq.addLast(i);
		}
		System.out.print(arr[dq.peekFirst()]+" ");
	}
}
