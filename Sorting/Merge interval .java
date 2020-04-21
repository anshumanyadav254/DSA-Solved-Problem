import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		//String[] str=sc.nextLine().split(" ");
		//Pair arr[] = new Pair[n];
		Pair arr[]=new Pair[n];
		for(int i=0;i<arr.length;i++){
		     arr[i]=new Pair(sc.nextInt(),sc.nextInt());
		}
		sc.close();
                
		Compare obj = new Compare(); 
        obj.compare(arr, n); 
	    int res=0;
	    for(int i=0;i<n;i++)
	    {
	        if(arr[res].end>=arr[i].start)
	        {
	            arr[res].end=Math.max(arr[res].end,arr[i].end);
	            arr[res].start=Math.min(arr[res].start,arr[i].start);
	        }
	        else
	        {
	            res++;
	            arr[res]=arr[i];
	        }
	        
	    }
	    for(int i=0;i<n;i++)
	    {
	        System.out.println(arr[i].start+" "+arr[i].end);
	    }
	}
		
	}

class Pair { 
    int start; 
    int end; 
  
    // Constructor 
public Pair(int start, int end) 
    { 
        this.start = start; 
        this.end = end; 
    } 
} 
class Compare { 
  
    static void compare(Pair arr[], int n) 
    { 
        // Comparator to sort the pair according to second element 
        Arrays.sort(arr, new Comparator<Pair>() { 
            @Override public int compare(Pair a, Pair b) 
            { 
                return a.start - b.start; 
            } 
        }); 
    }
}
// make interval and merge them this give some wrong ans I have to fix it
