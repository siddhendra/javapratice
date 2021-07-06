import java.util.HashSet;
import java.util.Set;

public class nullhashset {
    public static void main(String[] args) {
        Set<String> hs = new HashSet<>();
        hs.add("siddu");
        hs.add("sid");
        hs.add(null);
        hs.add("sidhu");
        hs.add("sid");
        System.out.println(hs);
    }
    
}
