import java.util.HashSet;
import java.util.Set;

public class noncommonelementset {
    public static void main(String[] args) {
        Set<String> hs = new HashSet<>();
        hs.add("f");
        hs.add("a");
        hs.add("n");
        hs.add("s");

        Set<String> hs1 = new HashSet<>();
        hs1.add("f");
        hs1.add("a");
        hs1.add("n");
        hs.removeAll(hs1);
        System.out.println(hs);

    }
    
}
