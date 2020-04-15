import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int[][] arr = new int[][] 
        { 
            {3, 0, 6, 5, 0, 8, 4, 0, 0}, 
            {5, 2, 0, 0, 0, 0, 0, 0, 0}, 
            {0, 8, 7, 0, 0, 0, 0, 3, 1}, 
            {0, 0, 3, 0, 1, 0, 0, 8, 0}, 
            {9, 0, 0, 8, 6, 3, 0, 0, 5}, 
            {0, 5, 0, 0, 9, 0, 6, 0, 0}, 
            {1, 3, 0, 0, 0, 0, 2, 5, 0}, 
            {0, 0, 0, 0, 0, 0, 0, 7, 4}, 
            {0, 0, 5, 2, 0, 6, 3, 0, 0} 
        }; 
		System.out.println(IsSuduco(arr));
		
	}
	static boolean IsSuduco(int arr[][])
	{
	    HashSet<String> seen=new HashSet<>();
	    for(int i=0;i<9;i++)
	    {
	        for(int j=0;j<9;j++)
	        {
	            int k=arr[i][j];
	            if(
	                !seen.add(k+"row"+ i)|| 
	                !seen.add(k+" collomn"+j)||
	                !seen.add(k+"_"+i%3+"_"+j%3))
	                {
	                    return true;
	                }
	        }
	    }
	    return false;
	}
}
