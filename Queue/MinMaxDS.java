import java.util.*;
class MyDS{
	Deque<Integer>dq;
	MyDS(){
		dq=new LinkedList<>();
	}
	void insertMin(int x){
		dq.offerFirst(x);
	}
	void insertMax(int x){
		dq.offerLast(x);
	}
	int getMin(){
		return dq.peekFirst();
	}
	int getMax(){
		return dq.peekLast();
	}
	int extractMin(){
		return dq.peekFirst();
	}
	int extractMax(){
		return dq.peekLast();
	}
}
// Create direct Min max function when we Enter value in some increasing or decreasing order

public class MinMaxDS {
	public static void main(String args[]){
		MyDS ds=new MyDS();
		ds.insertMax(12);
		ds.insertMax(14);
		ds.insertMax(16);
		ds.insertMin(11);
		ds.insertMin(9);
		ds.insertMin(4);
		System.out.println(ds.getMin());
		System.out.println(ds.getMax());
		System.out.println(ds.extractMin());
		System.out.println(ds.extractMax());



	}
}
