{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
		    arr[i] = sc.nextInt();
		}
		//int l = Integer.parseInt(br.readLine());
		//int r = Integer.parseInt(br.readLine());
		
		RadixSort(arr,n);
		for(int i=0;i<n;i++)
		{
		    System.out.print(arr[i]+" ");
		}
		
	}
	static void RadixSort (int arr[],int n)
	{
	    int max=arr[0];
	    for(int i=0;i<n;i++)
	    {
	        if(arr[i]>max)
	        {
	            max=arr[i];
	        }
	    }
	    for (int exp=1;max/exp>0;exp*=10)
	    {
	        CountingSort(arr,n,exp);
	    }
	  
	}
	static void CountingSort(int arr[],int n,int exp)
	{
	    int count[]=new int[10];
	    int output[]=new int[n];
	    for(int i=0;i<10;i++)
	   {
	       count[i]=0;
	       
	   }
	   for(int i=0;i<n;i++)
	   {
	       count[(arr[i]/exp)%10]++;
	   }
	   for(int i=1;i<10;i++)
	   {
	       count[i]=count[i]+count[i-1];
	   }
	   for(int i=n-1;i>=0;i--)
	   {
	       output[count[(arr[i]/exp)%10]-1]=arr[i];
	       count[(arr[i]/exp)%10]--;
	   }
	   for(int i=0;i<n;i++)
	   {
	       arr[i]=output[i];
	   }
	    
	}
	
}
// input n=9 arr[]= 9 8 7 6 5 4 3 2 1
// output= 1 2 3 4 56 7 8 9 
//int is best sort algo for huge number of digit element in arr
