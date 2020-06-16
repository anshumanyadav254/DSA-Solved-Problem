import java.util.*;

// All Operation of Deque

public class DequeOpration {
	public static void main(String args[]){
		Deque<Integer>dq=new LinkedList<Integer>();
		dq.offerFirst(10);
		dq.offerFirst(20);
		dq.offerFirst(5);
		dq.offerLast(15);

		System.out.println(dq.peekFirst());
		System.out.println(dq.peekLast());

		dq.pollFirst();
		dq.pollLast();

		System.out.println(dq.peekFirst());
		System.out.println(dq.peekLast());

		dq.offerFirst(5);
		dq.offerLast(15);
// for iterartion of deque
		Iterator it=dq.iterator();
		while(it.hasNext()){
			System.out.print(it.next()+" ");
		}
		System.out.println();
		for(int i:dq){
			System.out.print(i+" ");
		}

		// print deque in reverse order

		Iterator it1=dq.descendingIterator();
		System.out.println();
		while(it1.hasNext()){
			System.out.print(it1.next()+" ");
		}


	}
}
