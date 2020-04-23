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
        Inorder(root);
    }
    static void Inorder(Node root)
    {
        if(root!=null)
        {
            Inorder(root.left);
            System.out.print(root.key+" ");
            Inorder(root.right);
        }
    }
    
}
// output=40 20 10 30 
