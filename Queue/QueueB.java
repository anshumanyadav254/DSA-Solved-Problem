class QueueEfficient{
	static int arr[];
	static int front,cap,size;
	QueueEfficient(int c){
		arr=new int[c];
		cap=c;
		front=0;
		size=0;
	}
	static boolean isFull(){
		return (cap==size);
	}
	static boolean isEmpty(){
		return (size==0);
	}
	static int getfront(){
		if(isEmpty()){
			return -1;
		}
		else{
			return arr[front];
		}

	}
	static int getrear(){
		if(isEmpty()){
			return -1;
		}
		else{
			return arr[(front+size-1)%cap];
		}

	}
	static void enque(int x)
	{
		if(isFull()){
			return;
		}
		int rear=getrear();
		rear=(rear+1)%cap;
		arr[rear]=x;
		size++;
	}
	static void deque(){
		if(isEmpty()){
			return;
		}
		arr[front]=arr[(front+1)%cap];
		size--;
	}

}

public class QueueB {
	public static  void main(String args[])
	{
		QueueEfficient q=new QueueEfficient(3);
		q.enque(12);
		q.enque(13);
		q.enque(14);
		for(int i:q.arr){
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println(q.getfront());
		System.out.println(q.getrear());
		q.deque();
		for(int i:q.arr){
			System.out.print(i+" ");
		}
	}
}
