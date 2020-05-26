import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println(naivLeftMostIndex(str));
		System.out.println(FindRepeatleftMostIndex(str));
		System.out.println(alterfindindexofRep(str));
	}
	static int naivLeftMostIndex(String str)
	{
	    for(int i=0;i<str.length();i++)
	    {
	        for(int j=i+1;j<str.length();j++)
	        {
	            if(str.charAt(i)==str.charAt(j)){
	                return i;
	            }
	        }
	    }
	    return -1;
	}
	static int FindRepeatleftMostIndex(String str)
	{
	    int res=Integer.MAX_VALUE;
	    int fi[]=new int[256];
	    for(int i=0;i<256;i++)
	    {
	        fi[i]=-1;
	    }
	    for(int i=0;i<str.length();i++)
	    {
	        if(fi[str.charAt(i)]==-1)
	        {
	            fi[str.charAt(i)]=i;
	        }
	        else
	        {
	            res=Math.min(res,fi[str.charAt(i)]);
	            
	        }
	    }
	    return (res==Integer.MAX_VALUE)?-1:res;
	}
	
	// this alternate method is giving wrong answer
	static int alterfindindexofRep(String str)
	{
	    
	    int res=Integer.MAX_VALUE;
	    int fi[]=new int[256];
	    for(int i=0;i<256;i++)
	    {
	        fi[i]=-1;
	    }
	    for(int i=str.length()-1;i>=0;i--)
	    {
	        if(fi[str.charAt(i)]==-1)
	        {
	            fi[str.charAt(i)]=i;
	        }
	        else
	        {
	            res=fi[str.charAt(i)];
	            
	        }
	    }
	    return (res==Integer.MAX_VALUE)?-1:res;
	}
}
// input= geeksforgeeks output=g
