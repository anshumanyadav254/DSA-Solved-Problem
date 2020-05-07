/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
class Node{
	int data;
	Node next;
	Node (int d)
	{
		data=d;
	}
}
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{

		InsertAtBeg(2);
		InsertAtBeg(5);
		InsertAtBeg(10);
	  InsertAtBeg(12);
		InsertAtBeg(13);
		printNthNodeFromEnd(2);
	}
  static	Node head;
	static void InsertAtBeg(int x){
		Node temp=new Node(x);
		temp.next=head;
		head=temp;
	}
  
  
  // Effficient  Aproach by two pointer
  
	static void printNthNode(int n)
	{
		if(head==null){
			return;
		}
		Node first=head;
		for(int i=0;i<n;i++){
			if(first==null){return;}
			first=first.next;
		}
		Node second=head;
		while (first!=null){
			second=second.next;
			first=first.next;
		}
		System.out.println(second.data);

	}
  
  // Brout force Aproach by traversing whole array
  
	static void printNthNodeFromEnd(int n)
	{
		if(head==null){
			return;
		}
		int len=0;
		for(Node curr=head;curr!=null;curr=curr.next)
		{
			len++;
		}
		if(len<n)
		{
			return;
		}
		else{
			Node curr=head;
			for(int i=1;i<len-n+1;i++)
				curr=curr.next;
			System.out.println(curr.data);
		}

	}
}
// there are print function which print nth Node from starting
