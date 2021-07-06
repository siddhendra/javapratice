import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class unmodisupp {
    public static void main(String[] args) {
        Set<String> hs = new TreeSet<>();
        hs.add("s");
        hs.add("i");
        hs.add("d");
        Set<String> um = Collections.unmodifiableSet(hs);
        um.add("m");
        
    }
    
}
