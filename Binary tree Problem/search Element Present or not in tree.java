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
        root.left.right=new Node(32);
        root.right.left=new Node(50);
        root.right.right=new Node(70);
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //System.out.println("Enter Number to be Search"+n);
        //Preorder(root);
        System.out.println(IsNode(root,n));
       
    }
    static boolean IsNode(Node root,int n)
    {
        if(root==null){
            return false;
        }
        if(root.key==n)
        {
            return true;
            
        }
        boolean leftSubtree=IsNode(root.left,n);
        if(leftSubtree)
        {
            return true;
        }
        boolean rightSubtree=IsNode(root.right,n);
        return rightSubtree;
    }
    
}
// i/p=. x=10 output=true
