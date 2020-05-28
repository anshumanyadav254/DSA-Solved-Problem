/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    
		Scanner sc=new Scanner(System.in);
		
		String txt=sc.nextLine();
		
		String pat=sc.nextLine();
		/*int lps[]=new int[pat.length()];
		fillLPS(pat,lps);
		for(int i=0;i<lps.length;i++)
		{
		    System.out.print(lps[i]+" ");
		}*/
		KMPtoFindPattern(txt,pat);
		
	}
	static void fillLPS(String str,int lps[])
	{
	    int n=str.length(),len=0;
	    lps[0]=0;
	    int i=1;
	    while(i<n)
	    {
	        if(str.charAt(i)==str.charAt(len))
	        {
	            len++;
	            lps[i]=len;
	            i++;
	            
	        }
	        else
	        {
	            if(len==0)
	            {
	                lps[i]=0;
	                i++;
	                
	            }
	            else{
	                len=lps[len-1];
	            }
	            
	        }
	    }
	}
	
	static void KMPtoFindPattern(String txt,String pat)
	{
	    int N=txt.length();
	    int M=pat.length();
	    int lps[]=new int[M];
	    fillLPS(pat,lps);
	    int i=0,j=0;
	    while(i<N)
	    {
	        if(pat.charAt(j)==txt.charAt(i))
	        {
	            i++;
	            j++;
	        }
	        if(j==M)
	        {
	            System.out.print(i-j+" ");
	            j=lps[j-1];
	        }
	        else if(i<N && pat.charAt(j)!=txt.charAt(i)){
	            if(j==0){
	                i++;
	            }
	            else{
	                j=lps[j-1];
	            }
	        }
	    }

	}
}
/*
input=.  txt= ababcababaad pat=ababa
output. 5
