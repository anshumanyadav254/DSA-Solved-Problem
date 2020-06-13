import java.util.*;
class Queue {
	static int size,cap;
	static int arr[];
	Queue(int c){
		cap=c;
		size=0;
		arr=new int[cap];
	}
	static boolean iFull(){
		return (size==cap);

	}
	static boolean isEmpty(){
		return (size==0);
	}
	static void enque(int x){
		if(iFull()){
			return;
		}
		arr[size]=x;
		size++;
	}
	static void  deque()
	{
		if(isEmpty()){
			return;
		}
		for(int i=0;i<size-1;i++)
		{
			arr[i]=arr[i+1];
			size--;
		}
	}
	static int getfront(){
		if(isEmpty()){
			return -1;
		}
		else{
			return arr[0];
		}

	}
	static int getRear(){
		if(isEmpty()){
			return -1;
		}
		else{
			return  arr[size-1];
		}


	}
}
public class QueueA {
	public static void main(String args[]) {

       Queue q=new Queue(4);
		q.enque(10);
		q.enque(20);
		q.enque(30);
		q.enque(40);
		for (int i :q.arr) {
			System.out.print(i+" ");
		}
		System.out.println();

		System.out.println(q.getfront());
		System.out.println(q.getRear());
		q.deque();
		for (int i :q.arr) {
			System.out.print(i+" ");
		}



	}
}
