import java.util.*;
import java.util.Arrays;
class Codechef
{
    public static void main(String args[])
    {
        ArrayList<Integer> a=new ArrayList<Integer>();
        a.add(10);
        a.add(5);
        a.add(15);
        a.add(20);
        Collections.sort(a,Collections.reverseOrder());
        System.out.println(a);
      
    }
    
}
// outPut=[20, 15, 10, 5]
