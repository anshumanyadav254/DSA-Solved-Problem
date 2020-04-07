import java.util.*;
class Codechef
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int a1[]=new int [n1];
        for(int i=0;i<n1;i++)
        {
            a1[i]=sc.nextInt();
        }
        int n2=sc.nextInt();
        int a2[]=new int[n2];
        for(int i=0;i<n2;i++)
        {
            a2[i]=sc.nextInt();
        }
        //int n1=a1.length;
       //int n2=a2.length;
        
       System.out.println(GetMedian(a1,a2));
    }
    static double GetMedian(int a1[],int a2[])
    {
        int n1=a1.length;
        int n2=a2.length;
        int begin=0,end=n1;
        
        double res=1;
        while(begin<=end)
       {
           int i1=(begin+end)/2;
           int i2=(n1+n2+1)/2-i1;
           int min1=(i1==n1)?Integer.MAX_VALUE:a1[i1];
           int max1=(i1==0)?Integer.MIN_VALUE:a1[i1-1];
           int min2=(i2==n2)?Integer.MIN_VALUE:a2[i2];
           int max2=(i2==0)?Integer.MIN_VALUE:a2[i2-1];
           if(max1<=min2 && max2<=min1)
           {
               if((n1+n2)%2==0){
                   res=((double)Math.max(max1,max2)+Math.min(min1,min2));
               }
               else{
                   res=((double)Math.max(max1,max2));
               }
           }
           else if(max1>min2){
               end=i1-1;
           }
           else{
               begin=i1+1;
           }
          
       }
       return res;
    }
    
}

// this solution is not running properly you should edit this one
