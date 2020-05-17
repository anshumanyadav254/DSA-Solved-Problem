import java.util.*;
public class Hashset {
	public static void main(String args[])
	{
		HashSet<String>h=new HashSet<String>();
		h.add("Anshu");
		h.add("Man");
		h.add("Ide");
		System.out.println("hashset = "+h);
		System.out.println(h.contains("Ide"));

		Iterator<String>i=h.iterator();

		while(i.hasNext())
		{
			System.out.print(i.next()+" ");
		}
		System.out.println("Size of hashset before remove :"+ h.size());

		h.remove("Ide");

		System.out.println(" size of hashset after remove :"+h.size());

		for(String s:h)
		{
			System.out.print(s+" ");
		}
		System.out.println();
		System.out.println(h.isEmpty());

	}
}
