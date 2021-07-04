import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class hashmapff {
    public static void main(String[] args) {
        Hashtable<String ,Integer> ht = new Hashtable<>();
        ht.put("m", 87);
        ht.put("k", 88);
        ht.put("l", 86);
        Set<String> ks = ht.keySet();
        Iterator<String> i = ks.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
            ht.put("p", 85);
        }
    }
    
}
