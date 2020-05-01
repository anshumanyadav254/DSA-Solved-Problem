import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
class Node{
           int data;
           Node left;
           Node right;
           Node(int k)
           {
           data=k;
           }
           
}
public class MaxWidth
{
	public static void main(String args[]) {
		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		root.left.left = new Node(40);
		root.left.right = new Node(32);
		root.right.left = new Node(50);
		root.right.right = new Node(70);

		//PrintSpiralForm(root);
		Method2(root);
	}
  // M-1 Using Stack and Queue
  
  static void PrintSpiralForm(Node root){
		if(root==null)
		{
			return;
		}
		Queue<Node>q=new LinkedList<Node>();
		Stack<Integer>st=new Stack<Integer>();
		Boolean reverse=false;
		q.add(root);
		while(q.isEmpty()==false)
		{
			int count=q.size();
			for(int i=0;i<count;i++)
			{
				Node curr=q.poll();
				if(reverse)
				{
					st.push(curr.data);
				}
				else
				{
					System.out.print(curr.data+" ");
				}
				if(curr.left!=null)
				{
					q.add(curr.left);
				}
				if(curr.right!=null)
				{
					q.add(curr.right);
				}
			}
			if(reverse){
				while (st.isEmpty()==false)
				{
					System.out.print(st.pop()+" ");
				}

			}
			reverse=!reverse;
			//System.out.println();
		}

    }
    
    // M-2 Using two stack;
    
    static void Method2(Node root)
    {
    	if(root==null)
	    {
	    	return;
	    }
    	Stack<Node>s1=new Stack<Node>();
    	Stack<Node>s2=new Stack<Node>();
    	s1.push(root);
    	while(s1.isEmpty()==false || s2.isEmpty()==false)
	    {
	    	while (s1.isEmpty()==false)
		    {
		    	Node curr=s1.peek();
		    	s1.pop();
		    	System.out.print(curr.data+" ");
		    	if(curr.left!=null){
				    s2.push(curr.left);
			    }
		    	if(curr.right!=null){
				    s2.push(curr.right);
			    }

		    }
	    	while(s2.isEmpty()==false)
		    {
		    	Node curr=s2.peek();
		    	s2.pop();
		    	System.out.print(curr.data+" ");
		    	if(curr.right!=null){
				    s1.push(curr.right);
		    	}
		    	if(curr.left!=null){
				    s1.push(curr.left);
			    }
		    }
	    }
    }

}

// output of spiral form of tree is= 10 30 20 40 32 50 70 
