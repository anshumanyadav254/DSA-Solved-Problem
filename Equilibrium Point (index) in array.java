import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        int arr []=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(Eq(arr,n));
    }
    static int Eq(int arr[],int n)
    {
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum=sum+arr[i];
        }
        int l_sum=0;
        for(int i=0;i<n;i++)
        {
            if(l_sum==sum-arr[i])
            {
                return i+1;
            }
            l_sum=l_sum+arr[i];
            sum=sum-arr[i];
        }
        return -1;

    }
}
// if in array if sum of element in left side equal to sum of element right side that index is called equilibroum point
