/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes 
		Scanner sc=new Scanner(System.in);
		String txt=sc.nextLine();
		String pat=sc.nextLine();
		
	}
	static boolean iSAnagramPresent(String txt,String pat)
	{
	    int countText[]=new int[256];
	    int countPat[]=new int[256];
	    for(int i=0;i<pat.length();i++)
	    {
	        countText[txt.charAt(i)]++;
	        countPat[pat.charAt(i)]++;
	    }
	    for(int i=pat.length();i<txt.length();i++)
	    {
	        if(areSame(countText,countPat)){
	            return true;
	        }
	        countText[txt[i]]++;
	        countText[txt[i-pat.length()]]--;
	    }
	    return false;
	}
	static boolean areSame(String countText,String countPat)
	{
	    
	}
}
//input. text= geeksforgeeks ,pattern=egek output=yes
