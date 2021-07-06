import java.util.HashSet;
import java.util.Set;

public class commonelementsset {
    public static void main(String[] args) {
        Set<String> hs = new HashSet<>();
        hs.add("r");
        hs.add("u");
        hs.add("n");

        Set<String> hs1 = new HashSet<>();
        hs1.add("r");
        hs1.add("u");
        hs1.add("n");
        hs1.add("s");
        hs.retainAll(hs1);
        System.out.println(hs);
    }
    
}
