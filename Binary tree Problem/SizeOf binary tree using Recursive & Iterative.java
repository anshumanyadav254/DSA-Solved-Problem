import java.util.LinkedList;
import java.util.Queue;

class Node{
           int data;
           Node left;
           Node right;
           Node(int k){
                     data=k;
           }
}

public class SizeOfBinaryTree
{
	public static void main(String args[]) {
		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		root.left.left = new Node(40);
		root.left.right = new Node(32);
		root.right.left = new Node(50);
		root.right.left.left = new Node(70);

		//System.out.println(GetSize(root));
		System.out.println(SizeByItretive(root));
	}
	static  int GetSize(Node root)
	{
		if(root==null)
		{
			return 0;
		}
		else
			{
				return 1+GetSize(root.left)+GetSize(root.right);

		}
	}
	static int SizeByItretive(Node root)
	{
		Queue<Node>q=new LinkedList<Node>();
		q.add(root);
		int count=0;
		while(q.isEmpty()==false){
			Node curr=q.poll();
			if(curr.left!=null){
				q.add(curr.left);

			}
			if (curr.right!=null){
				q.add(curr.right);
			}
			count++;

		}
		return  count;
	}
}
