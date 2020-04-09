import java.util.*;
import java.util.Arrays;
class Codechef
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int l=0;
        int r=n-1;
        int m=l+(r-l)/2;
        mergeSort(arr,l,r);
        merge(arr,l,m,r);
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
      
    }
    public static void mergeSort(int arr[],int l,int r)
    {
        if(r>l){
            int m=l+(r-l)/2;
            mergeSort(arr,l,m);
            mergeSort(arr,m+1,r);
            merge(arr,l,m,r);
        }
        
    }
    public static void merge(int arr[],int l,int m,int r )
    {
        int n1=m-l+1;
        int n2=r-m;
        int left[]=new int[n1];
        int right[]=new int[n2];
        for (int i=0;i<n1;i++)
        {
            left[i]=arr[l+i];
        }
        for(int j=0;j<n2;j++)
        {
            right[j]=arr[m+1+j];
        
        }
        int i=0,j=0,k=l;
        while(i<n1 && j<n2)
        {
            if(left[i]<=right[j])
            {
                arr[k++]=left[i++];
            }
            else{
                arr[k++]=right[j++];
            }
        }
        while(i<n1){
            arr[k++]=right[j++];
        }
        while(j<n2){
            arr[k++]=right[j++];
        }
        
    }
    
}
// outPut=[20, 15, 10, 5]
