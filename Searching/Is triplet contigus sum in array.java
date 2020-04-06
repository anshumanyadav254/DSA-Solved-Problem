import java.util.*;
class Codechef
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int [n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int x=sc.nextInt();
        System.out.println(isTripletsum(arr,n,x));
        
    }
   static boolean IsPair(int arr[],int n,int x)
   {
       int left=0,right=n-1;
       while(left<right)
       {
           if(arr[left]+arr[right]==x)
           {
               return true;
           }
           else if(arr[left]+arr[right]>x)
           {
               right--;
           }
           else if(arr[left]+arr[right]<x)
           {
               left++;
           }
       }
       return false;
       
    
    
   }
   static boolean isTripletsum(int arr[],int n,int x)
   {
       for(int i=0;i<n;i++){
           if(IsPair(arr,n-1,x-arr[i])){
               return true;
           }
       }
       return false;
   }
    
}
// main constraint is that array must be in Sorted order and find the triplet sum if exist or not
// n= 7
// arr=[]=2 3 4 8 9 20 40
// x=32
// outPut= True
