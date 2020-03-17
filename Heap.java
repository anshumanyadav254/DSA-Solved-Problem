import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        for(int k=0;k<t;k++)
        {
            MinHeap myHeap=new MinHeap();
            int q=sc.nextInt();
            for(int i=0;i<q;i++)
            {
                int x=sc.nextInt();
                if(x==1)
                {

                    int insertedEl=sc.nextInt();
                    myHeap.insert(insertedEl);

                }
                else if (x==2)
                {
                    int delIndex=sc.nextInt();
                    myHeap.remove(delIndex);
                }
                else
                {
                    int minEl=myHeap.pop();
                    System.out.println(minEl);

                }
            }

            
           
        }
    }

}
class MinHeap
{
    int heap[]
    final int Max_size=150;
    int size;
    MinHeap()
    {
        heap=new int[Max_size];
        size=0;
    }
    private int leftChild(int pas)
    {
        return(2*pas+1);

    }
    private int ringhtChild(int pas)
    {
        return (2*pas+2);

    }
    private int parent(int pas)
    {
        return (pas-1)/2;
    }
    private boolean isLeafNode(int pas)
    {
        if(pas >= (size/2) && pas <=size )
        {
            return true;
        
        else
        {
            return false;

        }

    }
    private void swap(int x,int y)
    {
            heap[x]=heap[x]^heap[y];
            heap[y]=heap[x]^heap[y];
            heap[x]=heap[x]^heap[y];
    }
    public void insert(int val)
    {
        if (size==Max_size)
        {
            System.out.println("Heap is already full");
            return;
        }
        heap[size++]=val;
        int temp=size-1;
        while(parent(temp)>0 && heap[temp] < heap[parent(temp)])
        {
            swap(temp,parent(temp));
        }

    }
    public void remove(int x)
    {
        swap(x,--size);
        minHeapify(x);


    }
    public int pop()
    {
        int retElement=heap[0];

        swap(0,--size);
        minHeapify(0);
        return retElement;


    }
    private minHeapify(int pas)
    {
        if(!isLeafNode(pas))
        {
            if(heap[pas]> heap[leftChild(pas)] || heap[pas]>heap[ringhtChild(pas)])
            {
                if(heap[pas] > heap[leftChild(pas)])
                {
                    swap(pas,leftChild(pas));
                    minHeapify(leftChild(pas));

                }
                else
                {
                    swap(pas,ringhtChild(pas));
                    minHeapify(ringhtChild(pas));

                }
            }
        }
        
    }

}
