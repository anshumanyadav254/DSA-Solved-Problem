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
        Preorder(root);
    }
    static void Preorder(Node root)
    {
        if(root!=null)
        {
            System.out.print(root.key+" ");
            Preorder(root.left);
            Preorder(root.right);
        }
    }
    
}
// output=10 20 40 30 

