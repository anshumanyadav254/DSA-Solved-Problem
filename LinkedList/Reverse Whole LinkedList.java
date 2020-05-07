// BroutForce Aproach using arraylist

static Node reverse(Node head)
	{
	   ArrayList<Integer>arr=new ArrayList<Integer>();
	   for(Node curr=head;curr!=null;curr=curr.next )
	   {
	       arr.add(curr.data);
	   }
	   for(Node curr=head;curr!=null;curr=curr.next)
	   {
	       curr.data=arr.remove(arr.size()-1);
	   }
	   return head;
	}
  
  
  // Efficiant Aproach using two pointer prev and next;
  
  	static Node reverseEfficient(Node head)
	{
	    Node curr=head;
	    Node prev=null;
	    while(curr!=null)
	    {
	        Node next=curr.next;
	        curr.next=prev;
	        prev=curr;
	        curr=next;
	    }
	    return prev;
	    
	}
