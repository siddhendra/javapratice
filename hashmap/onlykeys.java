import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class onlykeys {
    public static void main(String[] args) {
        Map<String, Integer> m = new TreeMap<String, Integer>();
        m.put("m",900);
        m.put("a",800);
        m.put("d",700);
        m.put("a",600);
        m.put("l",500);
        m.put("a",400);
      Collection<Integer> v = m.values();
        Iterator<Integer> i = v.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
    }
    
}
