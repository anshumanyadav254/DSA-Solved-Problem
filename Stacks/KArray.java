class KStacksArray{
	int arr[],top[],next[];
	int k,freeTop,cap;
	KStacksArray(int k1,int n){
		k1=k;
		cap=n;
		arr=new int[cap];
		top=new int[k];
		next=new int[cap];
		for (int i=0;i<k;i++){
			top[i]=-1;
		}
		freeTop=0;
		for(int i=0;i<cap-1;i++)
		{
			next[i]=i+1;
		}
		next[cap-1]=-1;

	}
	void push(int x,int sn)
	{
		int i=freeTop;
		freeTop=next[i];
		next[i]=top[sn];
		top[sn]=i;
		arr[i]=x;
	}
	int pop(int sn)
	{
		int i=top[sn];
		top[sn]=next[i];
		next[i]=freeTop;
		freeTop=i;
		return arr[i];
	}


}

public class KArray {
	public static void main(String args[])
	{
		KStacksArray s=new KStacksArray(3,3);
		s.push(100,0);
		s.push(200,0);
		s.push(300,0);
		//s.push(500,1);
		//s.push(400,2);
		for(int i=0;i<9;i++){
			System.out.println(s.arr[i]+" ");
		}



	}
}
