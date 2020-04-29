import java.util.*;
import java.io.*;
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
class Codechef {
    
    static Node buildTree(String str){
        
        if(str.length()==0 || str.charAt(0)=='N'){
            return null;
        }
        
        String ip[] = str.split(" ");
        Node root = new Node(Integer.parseInt(ip[0]));

        Queue<Node> queue = new LinkedList<>(); 
        
        queue.add(root);

        int i = 1;
        while(queue.size()>0 && i < ip.length) {
            
            Node currNode = queue.peek();
            queue.remove();
                
            String currVal = ip[i];
                
            if(!currVal.equals("N")) {
                    
                currNode.left = new Node(Integer.parseInt(currVal));
                queue.add(currNode.left);
            }
                
            i++;
            if(i >= ip.length)
                break;
                
            currVal = ip[i];
                
            if(!currVal.equals("N")) {
                    
                currNode.right = new Node(Integer.parseInt(currVal));
                    
                queue.add(currNode.right);
            }
            i++;
        }
        
        return root;
    }
    
	public static void main (String[] args) throws IOException
	{
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        int t=Integer.parseInt(br.readLine());
    	    while(t > 0)
    	    {
	            String s = br.readLine();
    	    	Node root = buildTree(s);
        	    
    			//PrintNodeAtKthDistance(root,2);
    			System.out.println(IsChildrenSum(root));
            }
    }
    static boolean IsChildrenSum(Node root)
    {
       if(root==null)
        {
           return true;
        }
        if(root.left==null && root.right==null)
        {
            return true;
        }
        int sum=0;
        if(root.left!=null)
        {
            sum+=root.left.data;
        }
        if(root.right!=null)
        {
            sum+=root.right.data;
        }
        return (root.data==sum && IsChildrenSum(root.left) && IsChildrenSum(root.right));
    }
    
   
}
// sum of left child and right child will be equal to parent child
/* input= test case= 2.     output= true
20 8 12 3 5                         false
10 20 30 N N 70 80
