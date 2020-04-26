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
	        for(int j=1;j<n;j++)
	        {
	            int temp=arr[i][j];
	            arr[i][j]=arr[j][i];
	            arr[j][i]=temp;
	        }
	    }
	}
}
