import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;

public class itreatemapvalue {
    public static void main(String[] args) {
        Hashtable<String,Integer> h1 = new Hashtable<String,Integer>();
        h1.put("q", 2);
        h1.put("w", 3);
        h1.put("e", 4);
        h1.put("r", 5);
        Collection<Integer> v = h1.values();
        Iterator<Integer> i = v.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
    }
    
}
