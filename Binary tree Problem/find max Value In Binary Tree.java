
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
		//LevelTravesal(root);
		System.out.println(maxVlue(root));
	}
  static int maxValue(Node root)
	{
		if(root==null){
			return Integer.MIN_VALUE;
		}
		else{
			return Math.max(root.data,Math.max(maxValue(root.left),maxValue(root.right)));
		}

	}
	


}
