import java.util.*;
class Main{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int  t= sc.nextInt();
        while(t-->0)
        {
            int r=sc.nextInt();
            int c=sc.nextInt();
            int arr[][]=new int [r][c];
            for(int i=0;i<r;i++){
                for(int j=0;j<c;j++)
                {
                    arr[i][j]=sc.nextInt();

                }
            }
            printBoundry(arr,r,c);
            System.out.println();
            


        }
    }
    static void printBoundry(int arr[][],int r,int c)
    {
        if(r==1)
            {
                for(int i=0;i<c;i++)
                {
                    System.out.print(arr[0][i]+" ");
                }
            }
            else if(c==1)
            {
                for(int i=0;i<r;i++)
                {
                    System.out.print(arr[i][0]+" ");
                }
            }
            else
            {
                for(int i=0;i<c;i++)
                {
                    System.out.print(arr[0][i]+" ");

                }
                for(int i=1;i<r;i++)
                {
                    System.out.print(arr[i][c-1]+" ");
                }
                for(int i=c-2;i>=0;i--)
                {
                    System.out.print(arr[r-1][i]+" ");
                }
                for(int i=r-2;i>=1;i--)
                {
                    System.out.print(arr[i][0]+" ");
                }


            }

    }
   
    
}
//. r= 4 c= 4
//. arr= 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
//. output=. 1 2 3 4 8 12 16 15 14 13 9 5 
