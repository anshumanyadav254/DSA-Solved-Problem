/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.lang.Math;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=4;
		fun(n,'A','B','C');

	}
	static void fun(int n,char A,char B,char C)
	{
	    if(n==0)
	    {
	        System.out.println("mov 1 from "+A+" to "+C);
	        return;
	    }
	    fun(n-1,A,C,B);
	    System.out.println("move "+A+" to "+C);
	    fun(n-1,B,A,C);

	}
}
