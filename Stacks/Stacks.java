import java.util.Stack;

public class Stacks {
	public static  void main(String args[])
	{
		Stack<Integer>s=new Stack<Integer>();
		s.push(10);
		s.push(20);
		s.push(30);
		while (s.isEmpty()==false){
			System.out.println(s.pop());

		}
		s.push(3);
		s.push(4);
		System.out.println(s.size());
		System.out.println(s.peek());

	}
}
