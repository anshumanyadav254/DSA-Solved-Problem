class Node{
	int data;
	Node next;
	Node (int d)
	{
		data=d;
	}
}
class LinkedList{
	Node head;
	void InsertAtBeg(int x){
		Node temp=new Node(x);
		temp.next=head;
		head=temp;
	}
	void printList(){
		Node curr =head;
		while(curr!=null){
			System.out.print(curr.data+" ");
			curr=curr.next;
		}
	}
}
public class InsertAtBegining
{
	public static void main(String args[])
	{
		LinkedList l=new LinkedList();
		l.InsertAtBeg(2);
		l.InsertAtBeg(5);
		l.InsertAtBeg(10);
		l.printList();

	}
}
//OutPut= 10 5 2
