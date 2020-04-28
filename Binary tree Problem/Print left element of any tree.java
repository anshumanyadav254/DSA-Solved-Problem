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

public class PrintLevelLine
{
	public static void main(String args[]) {
		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		root.left.left = new Node(40);
		root.left.right = new Node(32);
		root.right.left = new Node(50);
		root.right.left.left = new Node(70);
		//LevelTravesalLine(root);
		PrintLeftView(root);
		System.out.println();
	}
static int maxlevel=0;
	static  void printLeft(Node root,int level)
	{
		if(root==null)
		{
			return ;
		}
		if(maxlevel<level)
		{
			System.out.print(root.data+" ");
			maxlevel=level;
		}
		printLeft(root.left,level+1);
		printLeft(root.right,level+1);
	}
	static void PrintLeftView(Node root){
		printLeft(root,1);
	}
 }
 // using Queue by iteration

static void PrintleftUsingIter(Node root)
	{
		if(root==null)
		{
			return;
		}

		Queue<Node> q=new LinkedList<Node>();
		q.add(root);
		while(q.isEmpty()==false)
		{
			int count=q.size();
			for(int i=0;i<count;i++)
			{
				Node curr =q.poll();
				if(i==0){
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
		}
 
 // out put =10 20 40 70 
