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
        	    
    			PrintNodeAtKthDistance(root,2);
    			System.out.println();
            }
    }
    static void PrintNodeAtKthDistance(Node root,int k)
    {
        if(root==null)
        {
            return;
        }
        if(k==0)
        {
            System.out.print(root.data+" ");
        }
        else
        {
            PrintNodeAtKthDistance(root.left,k-1);
            PrintNodeAtKthDistance(root.right,k-1);
            
        }
    }
}
/* input = 2
1 3 2 7 8 6 8
10 20 30 40 60 70 80

out put=
7 8 6 8 
40 60 70 80 */
