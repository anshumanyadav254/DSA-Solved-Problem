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
    int l=0;
    int r=n-1;
    //int m=l+(r-l)/2;
    System.out.println(CountInversion(arr,l,r));


 }
 static int CountInversion(int arr[],int l,int r)
 {
    int res=0;
    if(l<r)
    {
        int m=l+(r-l)/2;
        res+=CountInversion(arr,l,m);
        res+=CountInversion(arr,m+1,r);
        res+=countMerge(arr,l,m,r);
         
    }
    return res;
 }
 static int countMerge(int arr[],int l,int m,int r)
 {
     int n1=m-l+1;
     int n2=r-m;
     int left[]=new int[n1];
     int right[]=new int[n2];
     for(int i=0;i<n1;i++)
     {
        left[i]=arr[l+i];
     }
     for(int i=0;i<n2;i++)
     {
         right[i]=arr[m+1+i];
     }
     int res=0,i=0,j=0,k=l;
     while(i<n1 && j<n2)
     {
         if(left[i]<=right[j])
         {
             arr[k]=left[i];
             i++;
         }
         else
         {
             arr[k]=right[j];
             j++;
             res=res+(n1-i);
             
         }
         k++;
     }
     while(i<n1)
     {
         arr[k]=left[i];
         i++;j++;
     }
     while(j<n2)
     {
         arr[k]=right[j];
         i++;j++;
     }
     return res;
 }

}
// if a[i]>a[j] and i<j then that element is inversion of that;
//n=5
//arr=1 4 1 3 5
// Output =2
