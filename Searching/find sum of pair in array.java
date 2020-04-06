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
        System.out.println(IsPair(arr,n,x));
        
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
    
}
// find pair  if given sum present in array or not 
// I/P= n=5 arr[]=2 3 4 5 6 x=9 O/P= true
//program is with write with two pointer aproach 
