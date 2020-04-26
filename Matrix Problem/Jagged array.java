import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner (System.in);
		int m=sc.nextInt();
		int arr[][]=new int [m][];
		for(int i=0;i<arr.length;i++)
		{
		    arr[i]=new int[i+1];
		    for(int j=0;j<arr[i].length;j++)
		    {
		        arr[i][j]=i;
		        System.out.print(arr[i][j]+" ");
		    }
		    System.out.println();
		}
	}
}
//input =3
//out put= 0
//         1 1
//.        2 2 2 
