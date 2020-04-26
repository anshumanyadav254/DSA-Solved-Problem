/* package codechef; // don't place package name! */

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
            int c=sc.nextInt();
            int Mat[][]=new int [r][c];
            for(int i=0;i<r;i++)
            {
                for(int j=0;j<c;j++)
                {
                    Mat[i][j]=sc.nextInt();

                }
            }
            PrintSpiralMatrix(Mat,r,c);
            
        }
	}
	static void PrintSpiralMatrix(int arr[][],int r,int c)
	{
	    int top=0,left=0,right=r-1,bottom=c-1;
	    while(top<=bottom && left<=right)
	    {
	        for(int i=left;i<=right;i++)
	        {
	            System.out.print(arr[top][i]+" ");
	        }
	        top++;
	        for(int i=top;i<=bottom;i++)
	        {
	            System.out.print(arr[i][right]+" ");
	            
	        }
	        right--;
	        if(top<=bottom)
	        {
	            for(int i=right;i>=left;i--)
	            {
	                System.out.print(arr[bottom][i]+" ");
	            }
	            bottom--;
	        }
	        if(left<=right)
	        {
	            for (int i=bottom;i>=top;i--)
	            {
	                System.out.print(arr[i][left]+" ");
	            }
	            left++;
	        }
	    }
	}
}
/* input =
1
4 4
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16

output=1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10 */
