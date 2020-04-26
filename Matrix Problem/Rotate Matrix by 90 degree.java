import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
        int  t= sc.nextInt();
        while(t-->0)
        {
            int r=sc.nextInt();
            //int c=sc.nextInt();
            int Mat[][]=new int [r][r];
            for(int i=0;i<r;i++)
            {
                for(int j=0;j<r;j++)
                {
                    Mat[i][j]=sc.nextInt();

                }
            }
            transpose(Mat,r);
            ReverseCol(Mat,r);
            for(int i=0;i<r;i++)
            {
                for(int j=0;j<r;j++){
                    System.out.print(Mat[i][j]+" ");
                }
                System.out.println();
            }
        }
        
	}
	static void transpose(int arr[][],int n)
	{
	    for(int i=0;i<n;i++)
	    {
	        for(int j=i+1;j<n;j++)
	        {
	            int temp=arr[i][j];
	            arr[i][j]=arr[j][i];
	            arr[j][i]=temp;
	        }
	    }
	}
	static void ReverseCol(int arr[][],int n)
	{
	    for (int i=0;i<n;i++)
	    {
	        int low=0,high=n-1;
	        while(low<high)
	        {
	            int temp=arr[low][i];
	            arr[low][i]=arr[high][i];
	            arr[high][i]=temp;
	            low++;
	            high--;
	        }
	    }
	}
}
/* O(n*n) space=O(1)
input=1
4
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16

output=
4 8 12 16 
3 7 11 15 
2 6 10 14 
1 5 9 13 

  */
