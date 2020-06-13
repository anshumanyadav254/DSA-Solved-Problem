import java.util.*;
import java.util.Queue;
class Stack{
	Queue<Integer> q1,q2=new LinkedList<>();
	int top(){
		return q1.peek();
	}
	int sizeOfStack(){
		return q2.size();
	}
	int popOfStack(){
		return q1.peek();
	}
	void push(int x){
		while (q1.isEmpty()==false){
			q2.add(q1.peek());
			q1.poll();
		}
		while (q2.isEmpty()==false){
			q1.add(q2.peek());
			q2.poll();
		}
	}
}
public class StackusingQueue
{
	public static void main(String args[])
	{
		Stack s=new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		System.out.println(s.popOfStack());
	}
}
