import java.util.*;
import java.util.Queue;

public class QueueInjava {
	public static void main(String args[]){
		Queue<Integer>q=new LinkedList<>();
		q.add(10);
		q.add(20);
		q.add(30);
		System.out.println(q.poll());// delete front element and return it
		System.out.println(q.peek());// return front yani top element
		System.out.println(q.size());
		System.out.println(((LinkedList<Integer>) q).pop());// delete front element
		for(int i:q){
			System.out.print(i+" ");
		}

	}
}
