import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class replaceelementset {
    public static void main(String[] args) {
        Set<String> hs = new HashSet<>();
        hs.add("s");
        hs.add("a");
        hs.add("i");
        List<String> al = new ArrayList<>(hs);
        al.set(1, "w");
        System.out.println(al);
        
    }
    
}
