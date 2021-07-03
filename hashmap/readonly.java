import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class readonly {
    public static void main(String[] args) {
        Map<String, Integer> t1 = new TreeMap<String, Integer>();
        t1.put("d",15);
        t1.put("i",25);
        t1.put("s",35);
        t1.put("k",45);
        Map<String, Integer> um = Collections.unmodifiableMap(t1);
        um.put("e",55);
        System.out.println(um);
        
    }
    
}
