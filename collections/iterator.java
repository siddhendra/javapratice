import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class iterator {
    public static void main(String[] args) {
        Map<Character, String> hm = new HashMap<Character, String>();
        hm.put('m',"s");
        hm.put(null,null);
        hm.put('a',null);
        hm.put('d', "i");
        hm.put('l',"d");
        Set<Entry<Character, String>> es = hm.entrySet();
        Iterator<Entry<Character, String>> i = es.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
    }
    
}
