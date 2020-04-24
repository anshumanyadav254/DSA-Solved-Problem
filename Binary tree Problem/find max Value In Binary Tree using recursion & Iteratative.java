
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
	// Finding  max Value using Iterative Using Queue
	static int MaxusingQueue(Node root) 
	{
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		int res = Integer.MIN_VALUE;
		while (q.isEmpty() == false) {
			Node curr = q.poll();

			if (curr.left != null) {
				q.add(curr.left);

			}
			if (curr.right != null) {
				q.add(curr.right);
			}
			if (curr.data > res) {
				res = curr.data;
			}


		}
		return res;
	}	
	


}
