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
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		System.out.println(mainSol(arr,n));
		
	}
	/*
	Recursive Solution for finding optimal strategy for game:  firsst person is You and you have to pick coins from corner of array and and after that element is eliminated frin aray then 2nd
	man can also pick similar only at coner place both players are wanted to pick maximum coins 
	*/
	static int Sol(int arr[],int i,int j,int sum){
	    if(j==i+1){
	        return Math.max(arr[i],arr[j]);
	    }
	    else{
	        return Math.max(sum-Sol(arr,i+1,j,sum-arr[i]),sum-Sol(arr,i,j-1,sum-arr[j]));
	    }
	}
	static int mainSol(int arr[],int n){
	    int sum=0;
	    for(int i=0;i<n;i++){
	        sum+=arr[i];
	    }
	    return Sol(arr,0,n-1,sum);
	}
}
