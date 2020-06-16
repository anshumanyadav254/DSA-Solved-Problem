import java.util.*;
import java.util.Queue;

// print all number containg only 5 or 6

public class printDigitSpecial {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Queue<String>q=new LinkedList<String>();
		q.add("5");
		q.add("6");

		for(int count=0;count<n;count++){
			String curr=((LinkedList<String>) q).poll();
			System.out.println(curr);
			q.add(curr+"5");
			q.add(curr+"6");

		}
	}

}
