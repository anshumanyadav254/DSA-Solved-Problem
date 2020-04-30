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
    			System.out.println(isBalance(root));
            }
    }
    // Method- 01
    static int isBalance(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        int lth=isBalance(root.left);
        if(lth==-1)
        {
            return -1;
        }
        int rth=isBalance(root.right);
        if(rth==-1)
        {
            
            return -1;
            
        }
        if(Math.abs(lth-rth)>1)
        {
            return -1;
        }
        else
        {
            return Math.max(lth,rth)+1;
            
        }
    }
    // this method return hight of BT if every node is balance other wise return false; node is balance when balance factor is <=1
    
    // Method -2 Recursive Aproch;
    
    
    static boolean isBalanceRecur(Node root)
    {
        if(root==null)
        {
            return true;
            
        }
        int lelfchild=hight(root.left);
        int rightchild=hight(root.right);
        return (Math.abs(lelfchild-rightchild)<=1 && isBalanceRecur(root.left) &&isBalanceRecur(root.right));
    }
    static int hight(Node root)
    {
        if(root==null)
        {
            return 0;
            
        }
        else{
            return Math.max(hight(root.left),hight(root.right))+1;
        }
    }
    /*
    input=2
8 12 15 13 14 N 16 N N N N N 17.  output= False
8 12 15 13 14 N 16 N N N N N 17.  output= False
10 20 30 N N 70 80                output=true. ;*/
