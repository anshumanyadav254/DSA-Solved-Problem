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
		Scanner sc= new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		System.out.println(Anangram(s1,s2));
	}
	static boolean Anangram(String s1,String s2)
	{
	    if(s1.length()!=s2.length()){
	        return false;
	    }
	    int count[]=new int[265];
	    for(int i=0;i<s1.length();i++)
	    {
	        count[s1.charAt(i)]++;
	    }
	    for(int i=0;i<s2.length();i++)
	    {
	        count[s2.charAt(i)]--;
	    }
	    for(int i=0;i<256;i++)
	    {
	        if(count[i]!=0)
	        {
	            return false;
	        }
	    }
	    return true;
	}
}
// input.  s1= tea s2=eta output= yes
