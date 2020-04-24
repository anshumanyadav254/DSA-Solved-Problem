import java.util.LinkedList;
import java.util.Queue;
class Node{
	int data;
	Node left;
	Node right;
	Node(int k)
	{
		data=k;
	}
}
public class PrintLevel
{
	public static void main(String args[]) {
		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		root.left.left = new Node(40);
		root.left.right = new Node(32);
		root.right.left = new Node(50);
		root.right.right = new Node(70);
		LevelTravesal(root);
		System.out.println();
	}
	static  void LevelTravesal(Node root)
	{
		if(root==null)
		{
			return;
		}

		Queue<Node> q=new LinkedList<Node>();
		q.add(root);
		while(q.isEmpty()==false)
		{
			Node curr =q.poll();
			System.out.print(curr.data+" ");
			if(curr.left!=null)
			{
				q.add(curr.left);
			}
			if(curr.right!=null)
			{
				q.add(curr.right);
			}
		}
	}
}
// OutPut=10 20 30 40 32 50 70 
