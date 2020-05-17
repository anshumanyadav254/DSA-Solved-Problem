import java.util.*;
import java.util.Map;
import java.util.HashMap;
public class MapHash
{
	public static void main(String args[])
	{
		HashMap<String,Integer> hm=new HashMap<String, Integer>();
		hm.put("anshu",10);
		hm.put("man",20);
		hm.put("Ide",30);
		System.out.println("hash map keys & values :"+hm);
		System.out.println(" size of hashmap before remove :"+hm.size());
		for (Map.Entry<String, Integer> e:hm.entrySet())
		{
			System.out.print(e.getKey()+" "+e.getValue()+" ");
		}
		System.out.println();
		if(hm.containsKey("anshu")){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
		hm.remove("Ide");
		System.out.println(hm);
		if(hm.containsValue(15)){
			System.out.println("yes");
		}
		else{
			System.out.println("No");
		}
		System.out.println(hm.get("anshu"));
		System.out.println(hm.get("Ide"));

	}
}
