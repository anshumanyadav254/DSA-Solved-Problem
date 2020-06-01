
class Node {
	int data;
	Node next;

	Node(int d) {
		data = d;
	}
}
class LL{
	Node head;
	void push(int x)
	{
		Node temp=new Node(x);
		temp.next=head;
		head=temp;
	}
	int pop(){
		if(head==null){
			return 0;
		}
		int res=head.data;
		return res;
	}
	void printList(){
		Node curr =head;
		while(curr!=null){
			System.out.print(curr.data+" ");
			curr=curr.next;
		}
	}
}
public class StackUsingLinkedLst {
	public static void main(String args[]){
		LL l=new LL();
		l.push(10);
		l.push(20);
		l.pop();
		//System.out.println(l.pop());
		l.push(30);
		//System.out.println(l.pop());
		l.printList();


	}

}
