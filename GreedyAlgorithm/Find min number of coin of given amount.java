/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Arrays; 
import java.util.Collections;
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int arr[]={10,2,5,1};
		int n=arr.length;
		System.out.println(lol(arr,n,57));
	}
	// brutforec aproch
	
	static int lol(int arr[],int n,int amount){
        Arrays.sort(arr, Collections.reverseOrder()); 
	    int res=0;
	    for(int i=0;i<n;i++){
	        if(arr[i]<=amount){
	        int temp=(int)Math.floor(amount/arr[i]);
	        res=res+temp;
	        amount=amount-res*arr[i];
	        }
	        if(amount==0){
	            break;
	        }
	    }
	    return res;
	}
}
