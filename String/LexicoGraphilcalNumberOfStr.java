

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println(Lex_Rank(str));
		
	}
	static int Lex_Rank(String str)
	{
	    int rank=1;
	    int n=str.length();
	    int mul=fact(n);
	    int count[]=new int[256];
	    for(int i=0;i<n;i++)
	    {
	        count[str.charAt(i)]++;
	    }
	    for(int i=1;i<256;i++)
	    {
	        count[i]=count[i]+count[i-1];
	    }
	    for(int i=0;i<n;i++)
	    {
	        mul=mul/(n-i);
	        rank=rank+count[str.charAt(i)-1]*mul;
	        for(int j=str.charAt(i);j<256;j++)
	        {
	            count[j]--;
	        }
	    }
	    return rank;
	    
	}
	static int fact(int n)
	{
	    if(n==0){
	        return 1;
	    }
	    return (n*fact(n-1));
	}
}
// input= bac output=3
