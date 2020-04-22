/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
package Trees;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int k=(int)Math.pow(2,32);
		System.out.println(k);
	}
}
public class Heaps{
    private int capacity=10;
    private int size=0;
    int [] items=new int[capacity];
    private int getLeftChildIndex(int parentIndex)
    {
        return 2*parentIndex+1;
        
    }
    private int getRightChildIndex(int parentIndex)
    {
        return 2*parentIndex+2;
        
    }
    private int getParentIndex(int childIndex){
        return((childIndex-1)/2);
    }
    private boolean hasLeftChild(int index)
    {
        return getLeftChildIndex(index)<size;
    }
     private boolean hasRightChild(int index)
    {
        return getRightChildIndex(index)<size;
    }
     private boolean hasParentChild(int index)
    {
        return getLeftChildIndex(index)<size;
    }
}
// Binary Search trees not complete here
