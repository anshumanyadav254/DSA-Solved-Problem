import java.util.*;
class ArrayImplementation{

}
 class StackImplementtionArray {
	int arr[],cap,top;
	StackImplementtionArray(int n){
		cap=n;
		top=-1;
		arr=new int[n];
	}
	 void push(int x) {
		if (top == cap - 1) {
			System.out.println("Stack Overflow");
		}
		top++;
		arr[top] = x;
	}


	 int pop() {
		if (top == -1) {
			System.out.println("Stack is underflow");
		}
		int res = arr[top];
		top--;
		return res;
	}

}
public class ArrayStack{

	public static void main(String args[]) {
		StackImplementtionArray s = new StackImplementtionArray(5);
		s.push(10);
		s.push(20);
		s.pop();
		s.push(30);
		System.out.println(s.pop());
		s.push(40);
		s.push(50);
		s.pop();
		s.pop();

		for (int i = 0; i < s.cap; i++) {
			System.out.print(s.arr[i] + " ");
		}
	}

}

