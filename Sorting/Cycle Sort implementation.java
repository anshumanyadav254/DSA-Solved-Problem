import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
		    arr[i]=sc.nextInt();
		}
		CycleSort(arr,n);
		for(int i=0;i<n;i++)
		{
		    System.out.print(arr[i]+" ");
		}
	}
	 static void CycleSort(int arr[],int n)
	{
	    for(int cs=0;cs<n;cs++)
	    {
	        int item=arr[cs];
	        int pos=cs;
	        for(int i=cs+1;i<n;i++)
	        {
	            if(arr[i]<item){
	                pos++;
	            }
	        }
	        int temp=item;
	        item=arr[pos];
	        arr[pos]=temp;
	        while(pos!=cs)
	        {
	            pos=cs;
	            for(int i=cs+1;i<n;i++)
	            {
	                if(arr[i]<item){
	                pos++;
	            }
	            }
	            int t=item;
	            item=arr[pos];
	            arr[pos]=t;
	        }
	    }
	}
	
}
