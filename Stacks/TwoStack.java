import java.util.*;

import static java.lang.System.exit;

class TwoStacks{
	int arr[];
	int top1;
	int top2;
	int cap;
	TwoStacks(int n)
	{
		cap=n;
		top1=-1;
		top2=cap-1;
		arr=new int[n];
	}
	void push1(int x)
	{
		if(top1<top2-1)
		{
			top1++;
			arr[top1]=x;
		}
	}
	void push2(int x)
	{
		if(top1<top2-1)
		{
			top2--;
			arr[top2]=x;
		}
	}
	void pop1()
	{
		if(top1>=0){
			int x=arr[top1];
			top1--;
			return ;
		}
		else {
			exit(1);
		}

	}
	void pop2()
	{
		if(top2<cap){
			int x=arr[top2];
			top2++;
			return ;
		}
		else {
			exit(1);
		}

	}
}
public class TwoStack {
	public static void main(String args[])
	{
		TwoStacks s=new TwoStacks(6);
		s.push1(2);
		s.push1(3);
		s.push1(4);
		s.push2(7);
		s.pop2();
		s.push2(9);
		s.pop2();
		s.push2(4);
		s.push2(5);
		for(int i=0;i<6;i++){
			System.out.print(s.arr[i]+" ");
		}


	}
}
