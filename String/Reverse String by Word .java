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
		String str="Anshuman Yadav";
		char ans[]=ReveresStringByWord(str.toCharArray());
		char ans2[]=reverseWords(str.toCharArray());
		 System.out.println(ans);
		 System.out.println(ans2);
	}
	static char[] ReveresStringByWord(char str[]){
	    int start=0;
	    int n=str.length;
	    for(int end=0;end<n;end++){
	        if(str[end]==' '){
	            reverse1(str,start,end);
	            start=end+1;
	        }
	    }
	    reverse1(str,start,n-1);
	    reverse1(str,0,n-1);
	    return str;
	}
	static void reverse1(char str[],int low,int high){
	    char temp;
	    if(low<=high){
	         temp=str[low];
	        str[low]=str[high];
	       str[high]=temp;
	        low++;
	        high--;
	    }
	}
static void reverse(char str[],int start, int end) 
{

char temp;

while (start <= end) 
{
	
	temp = str[start];
	str[start] = str[end];
	str[end] = temp;
	start++;
	end--;
}
}
static char[] reverseWords(char []s)
{
  int n=s.length;

int start = 0;
for (int end = 0; end < n; end++) 
{
	if (s[end] == ' ') 
	{
	reverse(s, start, end-1);
	start = end + 1;
	}
}

reverse(s, start, n- 1);
reverse(s, 0, n - 1);
return s;
}

	
}
