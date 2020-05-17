import java.util.*;
public class CountFrequency
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
		//CountFreqNaiv(arr,n);
		EfficientCountFreq(arr,n);
	}
	static void CountFreqNaiv(int arr[],int n)
	{
		for(int i=0;i<n;i++)
		{
			boolean flag=false;
			for(int j=i-1;j>=0;j--)
			{
				if(arr[j]==arr[i]){
					flag=true;
					break;
				}

			}
			if(flag==true){
				continue;
			}
			int freq=1;
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]==arr[j]){
					freq++;
				}
			}
			System.out.println(arr[i]+" "+freq);
		}

	}
	static void EfficientCountFreq(int arr[],int n)
	{
		int cnt=0;
		LinkedHashMap<Integer,Integer>hm=new LinkedHashMap<Integer, Integer>();
		//HashMap<Integer,Integer>hm=new HashMap<Integer, Integer>();
		for(int i=0;i<n;i++)
		{
			if(hm.containsKey(arr[i])){
				hm.put(arr[i],hm.get(arr[i])+1);
			}
			else{
				hm.put(arr[i],1);
			}

		}
		for (Map.Entry<Integer,Integer>e:hm.entrySet()){
			System.out.println(e.getKey()+" "+e.getValue()+" ");
		}


	}
}
