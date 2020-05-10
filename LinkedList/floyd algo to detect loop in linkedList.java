static boolean IsLoop(){
        Node slow_p=head,fast_p=head;
        while(slow_p!=null && fast_p.next !=null)
        {
            slow_p=slow_p.next;
            fast_p.next=fast_p.next.next;
            if(slow_p==fast_p){
                return true;
            }
        }
        return false;
    }
