import java.util.*;
import java.util.Queue;
import java.util.Stack;
public class RevesreTheQueue
{
	public static void main(String args[]){
		//Scanner sc=new Scanner(System.in);
		Queue<Integer>q=new LinkedList<>();
		q.add(10);
		q.add(20);
		q.add(30);
		//reverse(q);
		ReverseEff(q);
		System.out.println(q);
	}
	static void reverse(Queue<Integer>q)
	{
		Stack<Integer>s=new Stack<>();
		while (q.isEmpty()==false)
		{
			s.push(q.remove());

		}
		while (s.isEmpty()==false)
		{
			q.add(s.pop());
		}
	}
	static void ReverseEff(Queue<Integer>q)
	{
		if(q.isEmpty()){
			return;
		}
		int x=q.poll();
		reverse(q);
		q.add(x);
	}
}
