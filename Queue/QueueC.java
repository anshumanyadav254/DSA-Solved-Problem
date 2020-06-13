class Node {
	int data;
	Node next;

	Node(int d) {
		data = d;
		next = null;

	}
}class QueueLinkedList{
		static Node front,rear;
		//int size;
		QueueLinkedList(){
			front=rear=null;
			//size=0;
		}
		static void enque(int x){
			Node tmp=new Node(x);
			if(front==rear){
				front=rear=tmp;

			}
			rear.next=tmp;
			rear=tmp;
			//return tmp;
		}
		static void deque(){
			if(front==rear){
				return;

			}
			//size--;
			front=front.next;
			if (front==null){
				rear=null;
			}
		}
		static void print(Node front){
			while (front!=null){
				System.out.print(front.data);
				front=front.next;
			}
		}
	}


public class QueueC
{
	public static void main(String args[]){
		//Node n=new Node(4);
		QueueLinkedList q=new QueueLinkedList();
		q.enque(10);
		q.enque(20);
		q.enque(30);
		//q.print(n);
		while (q.front!=q.rear){
			System.out.print(q.front.data);
			q.front=q.front.next;
		}

	}
}
