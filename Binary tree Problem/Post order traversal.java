import java.util.*;
class Node 
{
    int key;
    Node left;
    Node right;
    Node(int k)
    {
        key=k;
    }
    
    
}
class Codechef
{
    public static void main(String args[])
    {
        Node root =new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.left.left=new Node(40);
        postorder(root);
    }
    static void postorder(Node root)
    {
        if(root!=null)
        {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.key+" ");
        }
    }
    
}
// OutPut=40 20 30 10 
