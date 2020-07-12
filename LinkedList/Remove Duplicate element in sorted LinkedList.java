  public static Node removeDuplicates(Node head) {
      //Write your code here
      if(head==null || head.next==null){
          return head;
      }
      Node curr=head;
      if(curr.data==curr.next.data){
          curr.next=curr.next.next;
          removeDuplicates(curr);

      }
      else{
          removeDuplicates(curr.next);
      }
      return head;

    }
/*
input=
1
2
2
3
3
4
output= 1 2 3 4 
*/
