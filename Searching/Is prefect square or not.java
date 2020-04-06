class Codechef
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        System.out.println(prefectSquar(x));
        
    }
   static int prefectSquar(int x)
   {
       if(x==0 || x==1)
       {
        return x;
        }
        int start=1,end=x;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(mid*mid==x)
            {
                return mid;
            }
            else if(mid*mid<x)
            {     
                start=mid+1;
                //return mid;
            }
            else
            {
                end=mid-1;
            }
        }
        return -1;
    
    
   }
    
}
