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
public class DiameterOfTree {
	public static void main(String args[]) {
		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		root.left.left = new Node(40);
		root.left.right = new Node(32);
		root.right.left = new Node(50);
		root.right.right = new Node(70);

		//System.out.println(MaxWidth(root));
		//PrintSpiralForm(root);
		//System.out.print(maxHieghtbwleaf(root));
		Diameter(root);
		System.out.print(res);
	}
	static int hight(Node root)
	{
		if(root==null)
		{
			return 0 ;
		}
		else{
			return 1+Math.max(hight(root.left),hight(root.right));
		}
	}
	static  int maxHieghtbwleaf(Node root)
	{
		if(root==null)
		{
			return  0;
		}
		int d1=1+hight(root.left)+hight(root.right);
		int d2=maxHieghtbwleaf(root.left);
		int d3=maxHieghtbwleaf(root.right);
		return Math.max(d1,Math.max(d2,d3));

	}
	 static int res=0;
	static  int Diameter(Node root)
	{
		if(root==null)
		{
			return  0;
		}
		int lth=Diameter(root.left);
		int rth=Diameter(root.right);
		res=Math.max(res,1+lth+rth);
		return 1+Math.max(lth,rth);
	}
}
// output=5 Diameter means max gap between two node or max number of node in two node
