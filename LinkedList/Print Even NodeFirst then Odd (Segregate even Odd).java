/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
    }
}

class Codechef
{
    
    static Node head;

    static void insertAtEnd(int x){
        Node temp=new Node(x);
        if(head==null)
        {
            head=temp;
            return;
        }
        Node curr=head;
        while(curr.next!=null)
        {
            curr=curr.next;
            
        }
        curr.next=temp;
    }
    static void printList()
    {
        
        Node curr =head;
        while(curr!=null)
        {
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }
    
    static void segregateEvenOdd(){
        Node eS=null,eE=null,oS=null,oE=null;
        for(Node curr=head;curr!=null;curr=curr.next)
        {
            int x=curr.data;
            
            if(x%2==0)
            {
                if(eS==null)
                {
                    eS=curr;
                    eE=eS;
                }
                else
                {
                    eE.next=curr;
                    eE=eE.next;
                }
                
            }
            else
            {
                if(oS==null)
                {
                    oS=curr;
                    oE=oS;
                }
                else
                {
                    oE.next=curr;
                    oE=oE.next;
                }
                
            }
        }
        if(oS==null || eS==null)
        {
            return ;
        }
        eE.next=oS;
        oE.next=null;
        head=eS;
    }
     
	public static void main (String[] args) throws java.lang.Exception
	{
	    insertAtEnd(17);
	    insertAtEnd(15);
	    insertAtEnd(8);
	    insertAtEnd(12);
	    insertAtEnd(10);
	    insertAtEnd(5);
	    insertAtEnd(4);
	    segregateEvenOdd();
	    printList();

	}
}
// output= 8 12 10 4 17 15 5
