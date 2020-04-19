{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
		    arr[i]=sc.nextInt();
		}
		segregationNEgativPositive(arr,0,n);
		for(int i=0;i<n;i++)
		{
		    System.out.print(arr[i]+" ");
		}
		
	}
	static void segregationNEgativPositive (int arr[],int l,int h)
	{
	   int i=l-1;
	   int j=h;
	   while(true)
	   {
	       do{i++;}while(arr[i]==0);
	       do{j--;}while(arr[j]==1);
	       if(i>=j){
	           return;
	       }
	       int temp=arr[i];
	       arr[i]=arr[j];
	       arr[j]=temp;
	   }
	}
	
}
// O(n) with only one trvaersal and O(1) space
//input= 10
//arr[]=1 0 0 1 0 1 1 0 0 1
//O/p== 0 0 0 0 0 1 1 1 1 1 
