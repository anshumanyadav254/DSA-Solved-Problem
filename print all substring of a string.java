import java.util.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int index=0;
		String curr="";
		String str=sc.nextLine();
		fun(str,index,curr);

	}
	static void fun(String str,int index,String curr)
	{
	    //curr="";
	    //index=0;
	    int n=str.length();
	    if(index==n){
	        System.out.println(curr);
	        return;
	    }
	    fun(str,index+1,curr+str.charAt(index));
	    fun(str,index+1,curr);

	}
}
