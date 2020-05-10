void DetectRomoveLoop()
	{
		Node slow=head,fast=head;
		while ((slow!=null && fast.next!=null))
		{
			slow=slow.next;
			fast=fast.next.next;
			if(slow==fast){
				break;
			}
		}
		if(slow!=fast){
			return;
		}
		while (slow.next!=fast.next)
		{
			slow=slow.next;
			fast=fast.next;
		}
		fast.next=null;

	}
  
  // using floyd detection algo
