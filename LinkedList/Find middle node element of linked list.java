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
	void PrintMiddle()
	{
		if(head==null)
		{
			return;
		}
		int count=0;
		Node curr;
		for(curr=head;curr!=null;curr=curr.next)
		{
			count++;
		}
		curr=head;
		for(int i=0;i<count/2;i++)
		{
			curr=curr.next;
		}
		System.out.println(curr.data);
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
		l.InsertAtBeg(12);
		l.InsertAtBeg(13);
		l.InsertAtBeg(22);
		l.PrintMiddle();

	}
}
// out put=10
