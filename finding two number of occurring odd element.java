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
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
		    arr[i]=sc.nextInt();
		}
		int Xor=0,res1=0,res2=0;
		for(int i=0;i<n;i++){ Xor=Xor ^ arr[i];}
		int sn=Xor & ~(Xor-1);
		for(int i=0;i<n;i++){
		    if((arr[i]&sn )!=0){
		        
		        res1=res1^arr[i];
		    }
		    else{
		        res2=res2^arr[i];
		    }
		}
		System.out.println(res1);
		System.out.println(res2);
	}
}
