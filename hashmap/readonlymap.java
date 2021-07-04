import java.util.Collections;
import java.util.Hashtable;
import java.util.Map;
import java.util.stream.Collectors;

public class readonlymap {
    public static void main(String[] args) {
        Hashtable<String,Integer> ha = new Hashtable<>();
        ha.put("p", 79);
        ha.put("o", 78);
        ha.put("t", 77);
        Map<String, Integer> um = Collections.unmodifiableMap(ha);
        um.put("s", 76);
        System.out.println(um);
    }
    
}
