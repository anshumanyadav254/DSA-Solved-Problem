 static void delete(Node ptr){
        ptr.data=ptr.next.data;
        ptr.next=ptr.next.next;
    }
    
    // it is only for deleting node rather than last node
