import java.util.HashSet;
import java.util.Set;

public class hashsetfailfast {
    public static void main(String[] args) {
        Set<String> hs = new HashSet<>();
        hs.add("s");
        hs.add("i");
        hs.add("d");
        hs.add("h");
        hs.iterator();
    }
    
}
