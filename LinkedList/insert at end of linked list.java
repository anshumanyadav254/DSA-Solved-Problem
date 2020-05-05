
class LList{
	Node head;
	void InsertEnd(int x){
		Node temp=new Node(x);
		if(head==null){
			head=temp;
			return;
		}
		Node curr=head;
		while (curr.next!=null){
			curr=curr.next;
		}
		curr.next=temp;
	}
	void printList(){
		Node curr =head;
		while(curr!=null){
			System.out.print(curr.data+" ");
			curr=curr.next;
		}
	}
}
public class InsertAtEnd
{
	public static void main(String args[])
	{
		LList l=new LList();
		l.InsertEnd(2);
		l.InsertEnd(5);
		l.InsertEnd(10);
		l.printList();

	}
}
//output = 2 5 10
