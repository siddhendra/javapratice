import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class threadsafe {
    public static void main(String[] args) {
        Set<Integer> lhs = new LinkedHashSet<>();
        lhs.add(100);
        lhs.add(200);
        lhs.add(300);
        lhs.add(400);
        Set<Integer> ss = Collections.synchronizedSet(lhs);
        System.out.println(ss);
    }
    
}
