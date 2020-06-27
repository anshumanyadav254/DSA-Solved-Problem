import java.util.*;
class Main{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int W=sc.nextInt();
            int wt[]=new int[n];
            int val[]=new int[n];
            for(int i=0;i<n;i++){
                wt[i]=sc.nextInt();
                
            }
            for(int i=0;i<n;i++){
                val[i]=sc.nextInt();
                
            }
            System.out.println(knapsack(W,val,wt,n));
        }
    }
    static int knapsack(int W,int wt[],int val[],int n){
        if(n==0 || W==0){
            return 0;
        }
        if(wt[n-1]>W){
            return knapsack(W,wt,val,n-1);
        }
        else{
            return Math.max(knapsack(W,wt,val,n-1),val[n-1]+knapsack(W-wt[n-1],wt,val,n-1));
        }
    }
}
