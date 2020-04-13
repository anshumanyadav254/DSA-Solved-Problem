{

public static void main(String args[])
{
    
    
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for (int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    QuickSort(arr,0,n-1);
    for(int i=0;i<n;i++)
    {
        System.out.print(arr[i]+" ");
    }

 }
 public static void QuickSort(int arr[],int l,int h)
 {   
    if(l<h)
    {
        int p=Partition(arr,l,h);
        QuickSort(arr,l,p);
        QuickSort(arr,p+1,h);
    }
    
}
 static int Partition(int arr[],int l,int h)
 {
    int pivot=arr[l];
    int i=l-1;
    int j=h+1;
    while(true)
    {
        do{
            i++;
        }while(arr[i]<pivot);
        do{
            j--;
        }while(arr[j]>pivot);
        if(i>=j){
            return j;
        }
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    
 }

}
